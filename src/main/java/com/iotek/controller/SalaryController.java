package com.iotek.controller;

import com.iotek.model.Rewards;
import com.iotek.model.Salary;
import com.iotek.model.Staff;
import com.iotek.service.AttendanceService;
import com.iotek.service.RewardsService;
import com.iotek.service.SalaryService;
import com.iotek.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
//薪资
@Controller
public class SalaryController {
    @Resource
    private SalaryService salaryService;
    @Resource
    private AttendanceService attendanceService;
    @Resource
    private StaffService staffService;
    @Resource
    private RewardsService rewardsService;
    @RequestMapping(value = "/addSalary")
    public String addSalary(){
        return "addSalary";
    }
    @RequestMapping(value = "/updateSalary")
    public String updateSalary(HttpServletRequest request) throws  Exception{
        Integer sl_id = Integer.valueOf(request.getParameter("sl_id"));
        Salary salary = salaryService.querySalary(sl_id);
        request.setAttribute("salary",salary);
        return "updateSalary";
    }
    //结算薪资
    @RequestMapping(value = "/addSalaryServlet")
    public String addSalaryServlet(HttpServletRequest request)throws Exception{
        Integer s_id = Integer.valueOf(request.getParameter("s_id"));
        Staff staff = staffService.queryStaff(s_id);
        String s_month = request.getParameter("s_month");
        String s_time = request.getParameter("s_time");
        double prize=0;//奖惩金
        List<Rewards> rewardsList = rewardsService.queryAllRewardsById(s_id);
        if (rewardsList==null){
            prize=0;
        }else{
            for (Rewards rewards: rewardsList) {
                prize+=rewards.getRw_salary();
            }
        }
        /*int NormalDays=attendanceService.queryNormalDays(s_id);//正常天数
        int LateDays=attendanceService.queryLateDays(s_id);//迟到天数
        int EarlyDays=attendanceService.queryEarlyDays(s_id);//早退天数*/
        int NormalDays=0;
        int LateDays=0;
        int EarlyDays=0;
        double wage = staff.getS_salary();//底薪
        if(LateDays+EarlyDays+NormalDays-22<0){
            //(迟到+早退+正常)*底薪/22==底薪
            wage=(LateDays+EarlyDays+NormalDays)*wage/22;
        }else if(NormalDays>=28){
            //days>28
            //(迟到+早退+正常-22）* 500  加班费全勤奖+1000
            wage=wage+(LateDays+EarlyDays+NormalDays-22)* 500+2000;
        }else{
            //上班天数22<days<28
            wage=wage+(LateDays+EarlyDays+NormalDays-22)* 500;
        }
        //罚款（迟到+早退）*50
        double fine = (LateDays+EarlyDays)*50;//罚款
        //奖惩金
        double salarys=wage+prize-fine;
        Salary salary = new Salary(s_id, wage,fine,prize,salarys,s_month,s_time);
        if(salaryService.addSalary(salary)){
            request.setAttribute("msg","结算成功");
            return "admin";
        }else{
            request.setAttribute("msg","结算失败");
            return "admin";
        }
    }
    //删除薪资
    @RequestMapping(value = "/deleteSalaryServlet")
    public String deleteSalaryServlet(HttpServletRequest request)throws Exception{
        Integer sl_id = Integer.valueOf(request.getParameter("sl_id"));
        Salary salary = salaryService.querySalary(sl_id);
        if(salaryService.deleteSalary(salary)){
            request.setAttribute("msg","删除成功");
            return "admin";
        }else{
            request.setAttribute("msg","删除失败");
            return "admin";
        }
    }

    //修改薪资
    @RequestMapping(value = "/updateSalaryServlet")
    public String updateSalaryServlet(HttpServletRequest request)throws Exception{
        Integer sl_id = Integer.valueOf(request.getParameter("sl_id"));
        Salary salary = salaryService.querySalary(sl_id);
        int s_id = salary.getS_id();
        Double s_wage=Double.valueOf(request.getParameter("s_wage"));//底薪
        Double s_fine=Double.valueOf(request.getParameter("s_fine"));//罚款
        Double s_prize=Double.valueOf(request.getParameter("s_prize"));//奖惩金
        Double s_salarys=Double.valueOf(request.getParameter("s_salarys"));//总计薪资
        String s_month = salary.getS_month();
        String s_time = salary.getS_time();
        Salary salary1 = new Salary(sl_id,s_id,s_wage,s_fine,s_prize,s_salarys,s_month,s_time);
        System.out.println(salary1);
        if(salaryService.updateSalary(salary1)){
            request.setAttribute("msg","修改成功");
            return "admin";
        }else{
            request.setAttribute("msg","修改失败");
            return "admin";
        }
    }

    //管理员查看薪资
    @RequestMapping(value = "/queryAllSalaryServlet")
    public String queryAllSalaryServlet(HttpServletRequest request)throws Exception{
        List<Salary> salaries = salaryService.queryAllSalary();
        request.setAttribute("salaries",salaries);
        return "queryAllSalary";
    }

    //员工查看薪资
    @RequestMapping(value = "/querySalaryServlet")
    public String querySalaryServlet(HttpServletRequest request, HttpSession session)throws Exception{
        Staff staff = (Staff) session.getAttribute("staff");
        List<Salary> salaries = salaryService.queryStaffSalary(staff.getS_id());
        request.setAttribute("salaries",salaries);
        return "querySalary";
    }
}
