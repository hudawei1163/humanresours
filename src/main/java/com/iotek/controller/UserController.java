package com.iotek.controller;

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
    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }
    @RequestMapping("/user")
    public String user(){
        return "user";
    }
    @RequestMapping(value = "/updateUser")
    public String updateUser(){
        return "updateUser";
    }
    //用户登录
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
                Cookie cookie1 = new Cookie("pass", user.getU_pass());
                cookie.setMaxAge(60 * 60 * 24 * 30);
                cookie1.setMaxAge(60 * 60 * 24 * 30);
                response.addCookie(cookie);
                response.addCookie(cookie1);
            }
            request.setAttribute("msg", "登陆成功");
            return "user";
        } else {
            request.setAttribute("msg", "登陆失败");
            return "login";
        }
    }
    //用户自动登录
    @RequestMapping(value = "userLoginServlet")
    public String userLoginServlet(HttpServletRequest request,HttpSession session ){
        Cookie[] cookies = request.getCookies();
        String username=null;
        String userpass=null;
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            String value = cookie.getValue();
            if(name.equals("name")){
                username=value;
            }else if(name.equals("pass")){
                userpass=value;
            }
        }
        User u=new User(username,userpass);
        if (userService.queryUserByNameAndPass(u)!=null){
            User user=userService.queryUserByNameAndPass(u);
            session.setAttribute("user",user);
            session.setAttribute("name",username);
            session.setAttribute("pass",userpass);
            return "user";
        }else {
            return "../../index";
        }

    }
    //用户注册
    @RequestMapping("/registerServlet")
    public String registerServlet(HttpServletRequest request) throws Exception {
        User user1=userService.queryUserByName(request.getParameter("name"));
        if(user1==null){
            User user = new User(request.getParameter("name"),request.getParameter("pass"));
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
    //用户改密
    @RequestMapping("/updateUserServlet")
    public String updateUserServlet(HttpServletRequest request) throws Exception {
        User user = userService.queryUserByName(request.getParameter("name"));
        if (user == null) {
            request.setAttribute("msg", "用户名输入有误");
            return "updateUser";
        }
        String pass = request.getParameter("pass");
        String pass1 = request.getParameter("pass1");
        if (pass.equals(pass1)==false) {
            request.setAttribute("msg", "两次密码不一致");
            return "updateUser";
        }else{
            User user1 = new User(user.getU_id(),user.getU_name(), pass);
            if (userService.updateUser(user1)) {
                return "login";
            } else {
                request.setAttribute("msg", "修改失败");
                return "updateUser";
            }
        }
    }

}
