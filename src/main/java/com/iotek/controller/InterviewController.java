package com.iotek.controller;

import com.iotek.service.InterviewService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by lenovo on 2018/10/20.
 */
//面试
@Controller
public class InterviewController {
    @Resource
    private InterviewService interviewService;
    @RequestMapping(value = "/addInterview")
    public String addInterview(){
        return "addInterview";
    }
    @RequestMapping(value = "/updateInterview")
    public String updateInterview(){
        return "updateInterview";
    }
    //增加面试
    @RequestMapping(value = "/addInterviewServlet")
    public String addInterviewServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //删除面试
    @RequestMapping(value = "/deleteInterviewServlet")
    public String deleteInterviewServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //修改面试
    @RequestMapping(value = "/updateInterviewServlet")
    public String updateInterviewServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //查看面试
    @RequestMapping(value = "/queryInterviewServlet")
    public String queryInterviewServlet(HttpServletRequest request)throws Exception{
        return "queryInterview";
    }

}
