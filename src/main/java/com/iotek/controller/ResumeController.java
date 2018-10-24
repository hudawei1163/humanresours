package com.iotek.controller;

import com.iotek.model.Resume;
import com.iotek.model.User;
import com.iotek.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/10/20.
 */
//简历
@Controller
public class ResumeController {
    @Resource
    private ResumeService resumeService;
    @RequestMapping("/addResume")
    public String addResume(){
        return "addResume";
    }
    @RequestMapping("/updateResume")
    public String updateResume(){
        return "updateResume";
    }
    //写简历
    @RequestMapping(value = "/addResumeServlet")
    public String loginServlet(HttpServletRequest request, HttpServletResponse response) throws Exception {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return "login";
        }
        String r_name = request.getParameter("r_name");//简历名
        String u_name = user.getU_name();//姓名
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
        boolean blag = resumeService.addResume(new Resume(r_name,u_name,r_education,r_sex,r_birthplace,r_phone,
                r_mail,r_birthdate,r_status,r_idNumber,r_abode,r_jobIntention,r_workExperience,r_deliver,r_read));
        if (blag) {
            request.setAttribute("msg", "保存成功");
            return "queryRecruit";
        } else {
            request.setAttribute("msg", "保存失败");
            return "addResume";
        }
    }
    //修改简历
    @RequestMapping(value = "/updateResumeServlet")
    public String updateResumeServlet(HttpServletRequest request)throws Exception{
        Resume resume = (Resume) request.getAttribute("recruit");//获取修改的简历
        if(resumeService.updateResume(resume)){
            request.setAttribute("msg","修改成功");
            return "queryRecruit";
        }else{
            request.setAttribute("msg","修改失败");
            return "queryRecruit";
        }
    }
    //删除简历
    @RequestMapping(value = "/deleteRecruitServlet")
    public String deleteRecruitServlet(HttpServletRequest request) throws Exception{
        Resume resume = (Resume) request.getAttribute("recruit");//获取删除对象
        if(resumeService.deleteResume(resume)){
            request.setAttribute("msg","删除成功");
            return "queryRecruit";
        }else{
            request.setAttribute("msg","删除失败");
            return "queryRecruit";
        }
    }
    //管理员查看简历
    @RequestMapping("/queryResumeServlet")
    public String queryResume(HttpServletRequest request){
        List<Resume> resumes=resumeService.queryAllResume();//获取简历
        if(resumes==null){
            request.setAttribute("msg", "无人投递简历");
        }
        List<Resume> resumes1=new ArrayList<>();
        for (Resume resume:resumes) {
            if("未读".equals(resume.getR_deliver())){
                resumes1.add(resume);
            }
        }
        request.setAttribute("resumes",resumes1);
        return "queryResume";
    }

    //用户查看简历
    @RequestMapping("/queryUserResumeServlet")
    public String queryUserResume(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        List<Resume> resumes=resumeService.queryAllResumeByName(user.getU_name());//获取简历
        request.setAttribute("resumes",resumes);
        return "queryUserResume";
    }

    //投递简历
    @RequestMapping("/deliverResumeServlet")
    public String deliverResumeServlet(HttpServletRequest request)throws Exception{
        User user = (User) request.getSession().getAttribute("user");//获取用户
        if(user==null){
            return "login";
        }
        Resume resume=resumeService.queryResumeByName(request.getParameter("r_name"));//获取简历
        if (resume==null){
            return "addResume";
        }
        String r_deliver = "已投";//投递简历
        //修改简历r_deliver为已投递
        boolean blag=resumeService.updateResume(new Resume(resume.getR_name(),resume.getU_name(),resume.getR_education(),
                resume.getR_sex(),resume.getR_birthplace(),resume.getR_phone(), resume.getR_mail(),resume.getR_birthdate(),
                resume.getR_status(),resume.getR_idNumber(),resume.getR_abode(),resume.getR_jobIntention(),
                resume.getR_workExperience(),r_deliver,resume.getR_read()));
        if (blag) {
            request.setAttribute("msg", "投递成功");
            return "../../index";//申请成功返回主页
        } else {
            request.setAttribute("msg", "投递失败");
            return "queryRecruit";//申请失败返回招聘信息页面
        }
    }

}
