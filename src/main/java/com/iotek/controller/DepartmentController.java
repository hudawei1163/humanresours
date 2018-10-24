package com.iotek.controller;

import com.iotek.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by lenovo on 2018/10/22.
 */
//部门
@Controller
public class DepartmentController {
    @Resource
    private DepartmentService departmentService;
    @RequestMapping(value = "addDepartment")
    public String addDepartment(){
        return "addDepartment";
    }
    @RequestMapping(value = "updateDepartment")
    public String updateDepartment(){
        return "updateDepartment";
    }
    //增加部门
    @RequestMapping(value = "/addDepartmentServlet")
    public String addDepartmentServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //删除部门
    @RequestMapping(value = "/deleteDepartmentServlet")
    public String deleteDepartmentServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //修改部门
    @RequestMapping(value = "/updateDepartmentServlet")
    public String updateDepartmentServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //查看部门
    @RequestMapping(value = "/queryDepartmentServlet")
    public String queryDepartmentServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
}
