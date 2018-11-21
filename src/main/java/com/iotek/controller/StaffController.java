package com.iotek.controller;

import com.iotek.model.Position;
import com.iotek.model.Staff;
import com.iotek.service.PositionService;
import com.iotek.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
//员工
@Controller
public class StaffController {
    @Resource
    private StaffService staffService;
    @Resource
    private PositionService positionService;
    @RequestMapping(value = "/staff")
    public String staff(){
        return "staff";
    }
    @RequestMapping(value = "/queryAllStaff")
    public String queryAllStaff(){
        return "queryAllStaff";
    }
    @RequestMapping(value = "/updateStaff")
    public String updateStaff(){
        return "updateStaff";
    }
    @RequestMapping(value = "/updateaStaff")
    public String updateaStaff(){
        return "updateaStaff";
    }
    @RequestMapping(value = "/updateStaffGuard")
    public String updateStaffGuard(){
        return "updateStaffGuard";
    }
    @RequestMapping(value = "/updatebStaff")
    public String updatebStaff(){
        return "updatebStaff";
    }
    @RequestMapping(value = "/staffLogin")
    public String staffLogin(){
        return "staffLogin";
    }
    //增加员工
    @RequestMapping(value = "/addStaffServlet")
    public String addStaffServlet(HttpServletRequest request)throws Exception{
        String s_name= request.getParameter("u_name");
        String s_phone=request.getParameter("r_phone");//默认账号为手机号
        String p_name= request.getParameter("p_name");
        Position position=positionService.queryPosition(p_name);
        int p_id = position.getP_id();
        String s_pass=s_phone;
        double s_salary=5000;
        String s_status = "试用";
        Staff staff = new Staff(p_id,s_name,s_phone,s_pass,s_salary,s_status);
        if(staffService.addStaff(staff)){
            request.setAttribute("msg","添加成功");
            return "user";
        }else{
            request.setAttribute("msg","添加失败");
            return "user";
        }
    }
    //员工登录
    @RequestMapping(value = "/staffLoginServlet")
    public String staffLoginServlet(HttpServletRequest request, HttpSession session) throws Exception {
        if (request.getParameter("name").equals("admin") & request.getParameter("pass").equals("admin")) {
            return "admin";
        }
        Integer s_id = Integer.valueOf(request.getParameter("name"));
        String pass=request.getParameter("pass");
        Staff staff = staffService.queryStaff(s_id);
        if (pass.equals(staff.getS_pass())) {
            session.setAttribute("staff",staff);
            request.setAttribute("msg", "登陆成功");
            return "staff";
        } else {
            request.setAttribute("msg", "登陆失败");
            return "staffLogin";
        }
    }
    //员工转正
    @RequestMapping(value = "/updateaStaffServlet")
    public String updateaStaffServlet(HttpServletRequest request)throws Exception{
        Integer s_id = Integer.valueOf(request.getParameter("s_id"));
        Staff staff = staffService.queryStaff(s_id);
        if (staff == null) {
            request.setAttribute("msg", "工号输入有误");
            return "updateaStaff";
        }
        double s_salary = Double.valueOf(request.getParameter("s_salary"));
        String s_status = "转正";
        Staff staff1 = new Staff(s_id,staff.getP_id(),s_salary,s_status);
        if (staffService.updateStaff(staff1)) {
            return "admin";
        } else {
            request.setAttribute("msg", "修改失败");
            return "updateaStaff";
        }
    }

    //员工换岗
    @RequestMapping(value = "/updateStaffGuardServlet")
    public String updateStaffGuardServlet(HttpServletRequest request)throws Exception{
        Integer s_id = Integer.valueOf(request.getParameter("s_id"));
        request.setAttribute("s_id",s_id);
        return "updateStaffGuard1";
    }
    //员工换岗确定
    @RequestMapping(value = "/updateStaffGuard1Servlet")
    public String updateStaffGuard1Servlet(HttpServletRequest request)throws Exception{
        Integer s_id = Integer.valueOf(request.getParameter("s_id"));
        Integer p_id = Integer.valueOf(request.getParameter("p_id"));
        Position position = positionService.queryPositionById(p_id);
        Staff staff1 = new Staff(s_id,position.getP_id());
        if (staffService.updateStaff(staff1)) {
            return "admin";
        } else {
            request.setAttribute("msg", "修改失败");
            return "admin";
        }
    }
    //员工离职
    @RequestMapping(value = "/updatebStaffServlet")
    public String updatebStaffServlet(HttpServletRequest request)throws Exception{
        Integer s_id = Integer.valueOf(request.getParameter("s_id"));
        Staff staff = staffService.queryStaff(s_id);
        if (staff == null) {
            request.setAttribute("msg", "工号输入有误");
            return "updatebStaff";
        }
        double s_salary = 0;
        String s_status = "离职";
        Staff staff1 = new Staff(s_id,staff.getP_id(),s_salary,s_status);
        if (staffService.updateStaff(staff1)) {
            return "admin";
        } else {
            request.setAttribute("msg", "修改失败");
            return "updatebStaff";
        }
    }
    //员工改密
    @RequestMapping(value = "/updateStaffServlet")
    public String updateStaffServlet(HttpServletRequest request)throws Exception{
        Integer s_id = Integer.valueOf(request.getParameter("s_id"));
        Staff staff = staffService.queryStaff(s_id);
        if (staff == null) {
            request.setAttribute("msg", "用户名输入有误");
            return "updateStaff";
        }
        String pass = request.getParameter("pass");
        String pass1 = request.getParameter("pass1");
        if (pass.equals(pass1)==false) {
            request.setAttribute("msg", "两次密码不一致");
            return "updateStaff";
        }else{
            Staff staff1 = new Staff(staff.getS_id(), pass);
            if (staffService.updateStaff(staff1)) {
                return "staffLogin";
            } else {
                request.setAttribute("msg", "修改失败");
                return "updateStaff";
            }
        }
    }
    //查看员工信息
    @RequestMapping(value = "/queryStaffServlet")
    public String queryStaffServlet(HttpServletRequest request)throws Exception{
        Integer s_id = Integer.valueOf(request.getParameter("s_id"));
        Staff staff = staffService.queryStaff(s_id);
        request.setAttribute("staff",staff);
        return "queryStaff";
    }

    //查询职位的全部员工
    @RequestMapping(value = "/queryAllStaffServlet")
    public @ResponseBody List queryAllStaffServlet(HttpServletRequest request)throws Exception{
        Integer p_id = Integer.valueOf(request.getParameter("p_id"));
        List<Staff> staffs = staffService.queryAllStaffByPid(p_id);
        return staffs;
    }

}
