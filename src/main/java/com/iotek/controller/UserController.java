package com.iotek.controller;

import com.iotek.model.Resume;
import com.iotek.model.User;
import com.iotek.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by lenovo on 2018/10/19.
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
    @RequestMapping("admin")
    public String admin(){
        return "admin";
    }
    @RequestMapping(value = "/loginServlet")
    public String loginServlet(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {
        if (request.getParameter("name").equals("admin") & request.getParameter("pass").equals("admin")) {
            return "admin";
        }
        String name=request.getParameter("name");
        String pass=request.getParameter("pass");
        User user = userService.queryUserByNameAndPass(new User(name,pass));
        String log = request.getParameter("log");
        if (user != null) {
            session.setAttribute("user", user);
            if ("on".equals(log)) {
                Cookie cookie = new Cookie("name", user.getU_name());
                cookie.setMaxAge(60 * 60 * 24 * 30);
                response.addCookie(cookie);
            }
            request.setAttribute("msg", "登陆成功");
            return "../../index";
        } else {
            request.setAttribute("msg", "登陆失败");
            return "login";
        }
    }
    @RequestMapping("/registerServlet")
    public String registerServlet(HttpServletRequest request) throws Exception {
        User user1=userService.queryUserByName(request.getParameter("name"));
        if(user1==null){
            User user = new User(request.getParameter("name"),request.getParameter("pass"),request.getParameter("sex"),request.getParameter("phone"));
            if (userService.addUser(user)){
                request.setAttribute("msg","注册成功");
                return "login";
            }else{
                request.setAttribute("msg","注册失败");
                return "register";
            }
        }else{
            request.setAttribute("msg","注册失败,该用户名已经存在");
            return "register";
        }
    }




}
