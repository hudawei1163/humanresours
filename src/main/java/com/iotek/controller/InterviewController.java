package com.iotek.controller;

import com.iotek.service.InterviewService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2018/10/20.
 */
@Controller
public class InterviewController {
    @Resource
    private InterviewService interviewService;
    @RequestMapping(value = "/interview")
    public String interview(){
        return "interview";
    }
    @RequestMapping(value = "/interviewServlet")
    public String interviewServlet()throws Exception{
        return null;
    }
}
