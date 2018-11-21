package com.iotek.controller;

import com.iotek.model.Interview;
import com.iotek.model.Position;
import com.iotek.model.Resume;
import com.iotek.model.User;
import com.iotek.service.InterviewService;
import com.iotek.service.PositionService;
import com.iotek.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/10/20.
 */
//面试
@Controller
public class InterviewController {
    @Resource
    private InterviewService interviewService;
    @Resource
    private ResumeService resumeService;
    @Resource
    private PositionService positionService;
    @RequestMapping(value = "/addInterview")
    public String addInterview(HttpServletRequest request){
        Integer r_id = Integer.valueOf(request.getParameter("r_id"));
        Resume resume = resumeService.queryResumeById(r_id);
        int u_id = resume.getU_id();
        String u_name = resume.getU_name();
        String r_phone = resume.getR_phone();
        List<Position> positions= positionService.queryAllPosition();
        request.setAttribute("r_id",r_id);
        request.setAttribute("u_id",u_id);
        request.setAttribute("u_name",u_name);
        request.setAttribute("r_phone",r_phone);
        request.setAttribute("positions",positions);
        return "addInterview";
    }
    //通过面试
    @RequestMapping(value = "/updateInterviewServlet")
    public String updateInterviewServlet(HttpServletRequest request){
        Integer i_id = Integer.valueOf(request.getParameter("i_id"));
        Interview interview1 = interviewService.queryInterview(i_id);
        int r_id = interview1.getR_id();
        int u_id = interview1.getU_id();
        String u_name = interview1.getU_name();
        String r_phone = interview1.getR_phone();
        String p_name=interview1.getP_name();//招聘职位
        String i_date=interview1.getI_date();; //面试日期
        String i_status ="通过";
        Interview interview = new Interview(i_id,r_id,u_id,u_name,r_phone,p_name,i_status,i_date);
        if(interviewService.updateInterview(interview)){
            request.setAttribute("msg","修改成功");
            return "admin";
        }else{
            request.setAttribute("msg","修改失败");
            return "admin";
        }
    }
    //邀请面试
    @RequestMapping(value = "/addInterviewServlet")
    public String addInterviewServlet(HttpServletRequest request)throws Exception{
        Integer r_id = Integer.valueOf(request.getParameter("r_id"));
        Integer u_id = Integer.valueOf(request.getParameter("u_id"));
        String u_name = request.getParameter("u_name");
        String r_phone = request.getParameter("r_phone");
        String p_name=request.getParameter("p_name");//招聘职位
        String i_date=request.getParameter("i_date");//面试日期
        String i_status ="未过";
        Interview interview = new Interview(r_id,u_id,u_name,r_phone,p_name,i_status,i_date);
        if(interviewService.addInterview(interview)){
            request.setAttribute("msg","添加成功");
            return "admin";
        }else{
            request.setAttribute("msg","添加失败");
            return "admin";
        }
    }

    //管理员查看面试
    @RequestMapping(value = "/queryInterviewServlet")
    public String queryInterviewServlet(HttpServletRequest request)throws Exception{
        List<Interview> interviews1= interviewService.queryAllInterview();
        List<Interview> interviews= new ArrayList<>();
        for (Interview interview:interviews1) {
            if ("未过".equals(interview.getI_status())){
                interviews.add(interview);
            }
        }
        request.setAttribute("interviews",interviews);
        return "queryInterview";
    }
    //游客查看面试
    @RequestMapping(value = "/queryMyInterviewServlet")
    public String queryMyInterviewServlet(HttpServletRequest request)throws Exception{
        User user = (User) request.getSession().getAttribute("user");
        List<Interview> interviews1= interviewService.queryAllInterview();
        List<Interview> interviews= new ArrayList<>();
        for (Interview interview:interviews1) {
            if ((user.getU_id()==interview.getU_id())&&"通过".equals(interview.getI_status())){
                interviews.add(interview);
            }
        }
        request.setAttribute("interviews",interviews);
        return "queryUserInterview";
    }
}
