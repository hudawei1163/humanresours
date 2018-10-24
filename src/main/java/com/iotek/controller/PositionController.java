package com.iotek.controller;

import com.iotek.service.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by lenovo on 2018/10/22.
 */
//职位
@Controller
public class PositionController {
    @Resource
    private PositionService positionService;
    @RequestMapping(value = "addPosition")
    public String addPosition(){
        return "addPosition";
    }
    @RequestMapping(value = "updatePosition")
    public String updatePosition(){
        return "updatePosition";
    }
    //增加职位
    @RequestMapping(value = "/addPositionServlet")
    public String addPositionServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //删除职位
    @RequestMapping(value = "/deletePositionServlet")
    public String deletePositionServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //修改职位
    @RequestMapping(value = "/updatePositionServlet")
    public String updatePositionServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //查看职位
    @RequestMapping(value = "/queryPositionServlet")
    public String queryPositionServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }



}
