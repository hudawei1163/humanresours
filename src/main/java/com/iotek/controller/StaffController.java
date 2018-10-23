package com.iotek.controller;

import com.iotek.service.StaffService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2018/10/22.
 */
@Controller
public class StaffController {
    @Resource
    private StaffService staffService;
}
