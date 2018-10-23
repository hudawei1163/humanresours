package com.iotek.controller;

import com.iotek.service.RecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2018/10/20.
 */
//招聘信息
@Controller
public class RecruitController {
    @Resource
    private RecruitService recruitService;
    @RequestMapping(value = "/recruit")
    public String recruit(){
        return "recruit";
    }
    @RequestMapping(value = "/addRecruit")
    public String addRecruit(){
        return "addRecruit";
    }



    @RequestMapping(value = "/recruitServlet")
    public String recruitServlet() throws Exception{
        return null;
    }
}
