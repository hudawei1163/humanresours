package com.iotek.controller;

import com.iotek.model.Department;
import com.iotek.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
//部门
@Controller
public class DepartmentController {
    @Resource
    private DepartmentService departmentService;
    @RequestMapping(value = "addDepartment")
    public String addDepartment(){
        return "addDepartment";
    }
    @RequestMapping(value = "updateDepartment")
    public String updateDepartment(HttpServletRequest request){
        Integer d_id = Integer.valueOf(request.getParameter("d_id"));
        Department department = departmentService.queryDepartmentByid(d_id);
        request.setAttribute("department",department);
        return "updateDepartment";
    }
    //增加部门
    @RequestMapping(value = "/addDepartmentServlet")
    public String addDepartmentServlet(Department department,HttpServletRequest request)throws Exception{
        if(departmentService.addDepartment(department)){
            request.setAttribute("msg","添加成功");
            return "addDepartment";
        }else{
            request.setAttribute("msg","添加失败");
            return "addDepartment";
        }
    }
    //删除部门
    @RequestMapping(value = "/deleteDepartmentServlet")
    public String deleteDepartmentServlet(HttpServletRequest request)throws Exception{
        Integer d_id = Integer.valueOf(request.getParameter("d_id"));
        Department department = departmentService.queryDepartmentByid(d_id);
        if(departmentService.deleteDepartment(department)){
            request.setAttribute("msg","删除成功");
            return "admin";
        }else{
            request.setAttribute("msg","删除失败");
            return "admin";
        }
    }
    //修改部门
    @RequestMapping(value = "/updateDepartmentServlet")
    public String updateDepartmentServlet(HttpServletRequest request)throws Exception{
        Integer d_id = Integer.valueOf(request.getParameter("d_id"));
        String d_name=request.getParameter("d_name");//部门名称
        String d_time=request.getParameter("d_time");
        Department department = new Department(d_id,d_name,d_time);
        if(departmentService.updateDepartment(department)){
            request.setAttribute("msg","修改成功");
            return "updateDepartment";
        }else{
            request.setAttribute("msg","修改失败");
            return "updateDepartment";
        }
    }
    //查看部门
    @RequestMapping(value = "/queryDepartmentServlet")
    public String queryDepartmentServlet(HttpServletRequest request)throws Exception{
        List<Department> departments= departmentService.queryAllDepartment();
        request.setAttribute("departments",departments);
        return "queryDepartment";
    }
    //查看部门三级联动
    @RequestMapping(value = "/queryAllDepartmentServlet")
    public @ResponseBody List queryAllDepartmentServlet()throws Exception{
        List<Department> departments= departmentService.queryAllDepartment();
        return departments;
    }
    //增加职位查看部门
    @RequestMapping(value = "/queryDepartmentAddServlet")
    public String queryDepartmentAddServlet(HttpServletRequest request)throws Exception{
        List<Department> departments= departmentService.queryAllDepartment();
        request.setAttribute("departments",departments);
        return "addPosition";
    }


}
