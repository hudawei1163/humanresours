package com.iotek.controller;

import com.iotek.service.AttendanceService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2018/10/22.
 */
@Controller
public class AttendanceController {
    @Resource
    private AttendanceService attendanceService;
}
