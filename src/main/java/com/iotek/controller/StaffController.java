package com.iotek.controller;

import com.iotek.model.Staff;
import com.iotek.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by lenovo on 2018/10/22.
 */
//员工
@Controller
public class StaffController {
    @Resource
    private StaffService staffService;
    @RequestMapping(value = "addStaff")
    public String addStaff(){
        return "addStaff";
    }
    @RequestMapping(value = "updateStaff")
    public String updateStaff(){
        return "updateStaff";
    }
    //增加员工
    @RequestMapping(value = "/addStaffServlet")
    public String addStaffServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //修改员工
    @RequestMapping(value = "/updateStaffServlet")
    public String updateStaffServlet(HttpServletRequest request)throws Exception{
        return "staff";
    }
    //查看员工
    @RequestMapping(value = "/queryStaffServlet")
    public String queryStaffServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }


}
