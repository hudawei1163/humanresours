package com.iotek.controller;

import com.iotek.model.Staff;
import com.iotek.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
//员工
@Controller
public class StaffController {
    @Resource
    private StaffService staffService;
    @RequestMapping(value = "addStaff")
    public String addStaff(){
        return "addStaff";
    }
    @RequestMapping(value = "updateStaff")
    public String updateStaff(){
        return "updateStaff";
    }
    //增加员工
    @RequestMapping(value = "/addStaffServlet")
    public String addStaffServlet(HttpServletRequest request)throws Exception{
        String s_phone=request.getParameter("s_phone");
        String s_pass=request.getParameter("s_phone");//默认密码为手机号
        int p_id = ;//职位id
        Staff staff = new Staff(s_phone,s_pass,p_id);
        if(staffService.addStaff(staff)){
            request.setAttribute("msg","添加成功");
            return "admin";
        }else{
            request.setAttribute("msg","添加失败");
            return "addRecruit";
        }
        return "admin";
    }
    //员工改密

    //修改员工
    @RequestMapping(value = "/updateStaffServlet")
    public String updateStaffServlet(HttpServletRequest request)throws Exception{
        return "staff";
    }
    //查看员工
    @RequestMapping(value = "/queryStaffServlet")
    public String queryStaffServlet(HttpServletRequest request)throws Exception{
        List<Staff> staffs=staffService.queryAllStaff();
        request.setAttribute("staffs",staffs);
        return "queryAllstaff";
    }


}
