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
@Controller
public class StaffController {
    @Resource
    private StaffService staffService;
    @RequestMapping("/addStaffServlet")
    public String addStaffServlet(HttpServletRequest request) throws Exception {
        return null;
    }

}
