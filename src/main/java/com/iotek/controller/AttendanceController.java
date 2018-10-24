package com.iotek.controller;

import com.iotek.service.AttendanceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by lenovo on 2018/10/22.
 */
//考勤
@Controller
public class AttendanceController {
    @Resource
    private AttendanceService attendanceService;

    //增加考勤
    @RequestMapping(value = "/addAttendanceServlet")
    public String addAttendanceServlet(HttpServletRequest request)throws Exception{
        return "staff";//员工打卡返回员工主页
    }

    //查看考勤
    @RequestMapping(value = "/queryAttendanceServlet")
    public String queryAttendanceServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
}
