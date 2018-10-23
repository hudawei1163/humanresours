package com.iotek.controller;

import com.iotek.model.Resume;
import com.iotek.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lenovo on 2018/10/20.
 */
//简历
@Controller
public class ResumeController {
    @Resource
    private ResumeService resumeService;
    @RequestMapping("/writerResume")
    public String writerResume(){
        return "writerResume";
    }
    @RequestMapping("/queryResume")
    public String queryResume(){
        return "queryResume";
    }



    @RequestMapping(value = "/writerResumeServlet")
    public String loginServlet(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String  r_name = request.getParameter("r_name");//姓名
        String r_education=request.getParameter("r_education");//学历
        String r_sex=request.getParameter("r_sex");//性别
        String r_birthplace=request.getParameter("r_birthplace");// 籍贯
        String r_phone=request.getParameter("r_phone");//手机
        String r_mail=request.getParameter("r_mail");// 邮箱
        String r_birthdate=request.getParameter("r_birthdate");//出生日期
        String r_status=request.getParameter("r_status");// 政治面貌
        String r_idNumber=request.getParameter("r_idNumber");//证件号码
        String r_abode=request.getParameter("r_abode");// 现居住地
        String r_jobIntention=request.getParameter("r_jobIntention");//求职意向
        String r_workExperience=request.getParameter("r_workExperience"); // 工作经验
        String r_deliver = "未投";//是否投递
        String r_read = "未读";//未读已读
        boolean blag = resumeService.addResume(new Resume(r_name,r_education,r_sex,r_birthplace,r_phone,
                r_mail,r_birthdate,r_status,r_idNumber,r_abode,r_jobIntention,r_workExperience,r_deliver,r_read));
        if (blag) {
            request.setAttribute("msg", "保存成功");
            return "index";
        } else {
            request.setAttribute("msg", "保存失败");
            return "login";
        }
    }
}
