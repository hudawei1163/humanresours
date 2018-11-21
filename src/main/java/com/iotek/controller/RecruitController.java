package com.iotek.controller;

import com.iotek.model.Position;
import com.iotek.model.Recruit;
import com.iotek.service.PositionService;
import com.iotek.service.RecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/10/20.
 */
//招聘信息
@Controller
public class RecruitController {
    @Resource
    private RecruitService recruitService;
    @Resource
    private PositionService positionService;
    @RequestMapping(value = "addRecruit")
    public String addRecruit(HttpServletRequest request){
        List<Position> positions= positionService.queryAllPosition();
        request.setAttribute("positions",positions);
        return "addRecruit";
    }
    @RequestMapping(value = "updateRecruit")
    public String updateRecruit(HttpServletRequest request){
        Integer r_id = Integer.valueOf(request.getParameter("r_id"));
        request.setAttribute("r_id",r_id);
        List<Position> positions= positionService.queryAllPosition();
        request.setAttribute("positions",positions);
        return "updateRecruit";
    }
    //增加招聘信息
    @RequestMapping(value = "/addRecruitServlet")
    public String addRecruitServlet(HttpServletRequest request) throws Exception{
        Position position = positionService.queryPosition(request.getParameter("positions"));
        int p_id=position.getP_id();
        String r_workExperience = request.getParameter("r_workExperience");
        String r_education = request.getParameter("r_education");
        Integer r_peopleNumber = Integer.valueOf(request.getParameter("r_peopleNumber"));
        String r_workplace = request.getParameter("r_workplace");
        Double r_salary = Double.valueOf(request.getParameter("r_salary"));
        String r_date = request.getParameter("r_date");
        Recruit recruit = new Recruit(p_id,r_workExperience,r_education,r_peopleNumber,r_workplace,r_salary,r_date);
        if(recruitService.addRecruit(recruit)){
            request.setAttribute("msg","添加成功");
            return "admin";
        }else{
            request.setAttribute("msg","添加失败");
            return "admin";
        }
    }
    //修改招聘信息
    @RequestMapping(value = "/updateRecruitServlet")
    public String updateRecruitServlet(HttpServletRequest request) throws Exception{
        Integer r_id = Integer.valueOf(request.getParameter("r_id"));
        Position position = positionService.queryPosition(request.getParameter("p_name"));
        int p_id=position.getP_id();
        String r_workExperience = request.getParameter("r_workExperience");
        String r_education = request.getParameter("r_education");
        Integer r_peopleNumber = Integer.valueOf(request.getParameter("r_peopleNumber"));
        String r_workplace = request.getParameter("r_workplace");
        Double r_salary = Double.valueOf(request.getParameter("r_salary"));
        String r_date = request.getParameter("r_date");
        Recruit recruit = new Recruit(r_id,p_id,r_workExperience,r_education,r_peopleNumber,r_workplace,r_salary,r_date);
        if(recruitService.updateRecruit(recruit)){
            request.setAttribute("msg","修改成功");
            return "admin";
        }else{
            request.setAttribute("msg","修改失败");
            return "admin";
        }
    }
    //删除招聘信息
    @RequestMapping(value = "/deleteRecruitServlet")
    public String deleteRecruitServlet(HttpServletRequest request) throws Exception{
        Integer r_id = Integer.valueOf(request.getParameter("r_id"));
        Recruit recruit = recruitService.queryRecruit(r_id);//获取删除对象
        if(recruitService.deleteRecruit(recruit)) {
            request.setAttribute("msg", "删除成功");
            return "admin";
        }else{
            request.setAttribute("msg","删除失败");
            return "admin";
        }
    }
    //管理员查看招聘信息
    @RequestMapping("/adminQueryRecruitServlet")
    public String adminQueryRecruitServlet(HttpServletRequest request) throws Exception{
        List<Recruit> recruits=  recruitService.queryAllRecruit();
        request.setAttribute("recruits",recruits);
        List<Position> positions = new ArrayList<>();
        for (Recruit recruit:recruits) {
            positions.add(positionService.queryPositionById(recruit.getP_id()));
        }
        request.setAttribute("positions",positions);
        return "adminQueryRecruit";
    }
    //用户查看招聘信息
    @RequestMapping("/queryRecruitServlet")
    public String queryRecruitment(HttpServletRequest request) throws Exception{
        List<Recruit> recruits=  recruitService.queryAllRecruit();
        request.setAttribute("recruits",recruits);
        List<Position> positions = new ArrayList<>();
        for (Recruit recruit:recruits) {
            positions.add(positionService.queryPositionById(recruit.getP_id()));
        }
        request.setAttribute("positions",positions);
        return "queryRecruit";
    }

}
