package com.iotek.controller;

import com.iotek.model.Recruit;
import com.iotek.service.RecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2018/10/20.
 */
//招聘信息
@Controller
public class RecruitController {
    @Resource
    private RecruitService recruitService;
    @RequestMapping(value = "addRecruit")
    public String addRecruit(){
        return "addRecruit";
    }
    @RequestMapping(value = "updateRecruit")
    public String updateRecruit(){
        return "updateRecruit";
    }
    //增加招聘信息
    @RequestMapping(value = "/addRecruitServlet")
    public String addRecruitServlet(HttpServletRequest request) throws Exception{
        String p_id=request.getParameter("p_id");//职位
        String r_workExperience=request.getParameter("r_workExperience");//工作经验
        String r_education=request.getParameter("r_education");//学历
        int r_peopleNumber = Integer.parseInt(request.getParameter("r_peopleNumber"));//招人数//强制装换为整形
        String r_workplace=request.getParameter("r_workplace");//工作地点
        double r_salary= (double) request.getAttribute("r_salary");//薪资
        String r_date= new SimpleDateFormat("YYYY-MM-DD").format(new Date()); //日期
        Recruit recruit = new Recruit(p_id,r_workExperience,r_education,r_peopleNumber,r_workplace,r_salary,r_date);
        if(recruitService.addRecruit(recruit)){
            request.setAttribute("msg","添加成功");
            return "admin";
        }else{
            request.setAttribute("msg","添加失败");
            return "addRecruit";
        }
    }
    //修改招聘信息
    @RequestMapping(value = "/updateRecruitServlet")
    public String updateRecruitServlet(HttpServletRequest request) throws Exception{
        Recruit recruit = (Recruit) request.getAttribute("recruit");//获取修改对象
        String p_id=request.getParameter("p_id");//职位
        String r_workExperience=request.getParameter("r_workExperience");//工作经验
        String r_education=request.getParameter("r_education");//学历
        int r_peopleNumber = Integer.parseInt(request.getParameter("r_peopleNumber"));//招人数//强制装换为整形
        String r_workplace=request.getParameter("r_workplace");//工作地点
        double r_salary= (double) request.getAttribute("r_salary");//薪资
        String r_date= new SimpleDateFormat("YYYY-MM-DD").format(new Date()); //日期
        Recruit recruit1 = new Recruit(p_id,r_workExperience,r_education,r_peopleNumber,r_workplace,r_salary,r_date);
        if(recruitService.updateRecruit(recruit1)){
            request.setAttribute("msg","修改成功");
            return "admin";
        }else{
            request.setAttribute("msg","修改失败");
            return "queryRecruit";
        }
    }
    //删除招聘信息
    @RequestMapping(value = "/deleteRecruitServlet")
    public String deleteRecruitServlet(HttpServletRequest request) throws Exception{
        Recruit recruit = (Recruit) request.getAttribute("recruit");//获取删除对象
        if(recruitService.deleteRecruit(recruit)){
            request.setAttribute("msg","删除成功");
            return "admin";
        }else{
            request.setAttribute("msg","删除失败");
            return "queryRecruit";
        }
    }
    //查看招聘信息
    @RequestMapping("/queryRecruitServlet")
    public String queryRecruitment(HttpServletRequest request) throws Exception{
        List<Recruit> recruit=  recruitService.queryAllRecruit();
        request.setAttribute("recruitment",recruit);
        return "queryRecruit";
    }




}
