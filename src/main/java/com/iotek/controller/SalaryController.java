package com.iotek.controller;

import com.iotek.service.SalaryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by lenovo on 2018/10/22.
 */
//薪资
@Controller
public class SalaryController {
    @Resource
    private SalaryService salaryService;
    @RequestMapping(value = "/addSalary")
    public String addSalary(){
        return "addSalary";
    }
    @RequestMapping(value = "/updateSalary")
    public String updateSalary(){
        return "updateSalary";
    }
    //增加薪资
    @RequestMapping(value = "/addSalaryServlet")
    public String addSalaryServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //删除薪资
    @RequestMapping(value = "/deleteSalaryServlet")
    public String deleteSalaryServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //修改薪资
    @RequestMapping(value = "/updateSalaryServlet")
    public String updateSalaryServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //查看薪资
    @RequestMapping(value = "/querySalaryServlet")
    public String querySalaryServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
}
