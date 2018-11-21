package com.iotek.controller;

import com.iotek.model.Department;
import com.iotek.model.Position;
import com.iotek.service.DepartmentService;
import com.iotek.service.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
//职位
@Controller
public class PositionController {
    @Resource
    private PositionService positionService;
    @Resource
    private DepartmentService departmentService;
    @RequestMapping(value = "/addPosition")
    public String addPosition(){
        return "addPosition";
    }
    @RequestMapping(value = "/updatePosition")
    public String updatePosition(HttpServletRequest request) throws Exception{
        Integer p_id = Integer.valueOf(request.getParameter("p_id"));
        Position position = positionService.queryPositionById(p_id);
        request.setAttribute("position",position);
        return "updatePosition";
    }
    //增加职位
    @RequestMapping(value = "/addPositionServlet")
    public String addPositionServlet(HttpServletRequest request)throws Exception {
        Department department = departmentService.queryDepartment(request.getParameter("departments"));
        String p_name = request.getParameter("p_name");
        Position position = new Position(department.getD_id(), p_name);
        List<Department> departments= departmentService.queryAllDepartment();
        request.setAttribute("departments",departments);
            if (positionService.addPosition(position)) {
                request.setAttribute("msg", "添加成功");
                return "addPosition";
            } else {
                request.setAttribute("msg", "添加失败");
                return "addPosition";
            }
    }
    //删除职位
    @RequestMapping(value = "/deletePositionServlet")
    public String deletePositionServlet(HttpServletRequest request)throws Exception{
        Integer p_id = Integer.valueOf(request.getParameter("p_id"));
        Position position = positionService.queryPositionById(p_id);
        if(positionService.deletePosition(position)){
            request.setAttribute("msg","删除成功");
            return "admin";
        }else{
            request.setAttribute("msg","删除失败");
            return "admin";
        }
    }
    //修改职位
    @RequestMapping(value = "/updatePositionServlet")
    public String updatePositionServlet(HttpServletRequest request)throws Exception{
        Integer p_id = Integer.valueOf(request.getParameter("p_id"));
        Position position1 = positionService.queryPositionById(p_id);
        String p_name=request.getParameter("p_name");//职位名称
        Position position = new Position(p_id,position1.getD_id(),p_name);
        if(positionService.updatePosition(position)){
            request.setAttribute("msg","修改成功");
            return "admin";
        }else{
            request.setAttribute("msg","修改失败");
            return "admin";
        }
    }
    //查看职位
    @RequestMapping(value = "/queryPositionServlet")
    public String queryPositionServlet(HttpServletRequest request)throws Exception{
        List<Position> positions= positionService.queryAllPosition();
        request.setAttribute("positions",positions);
        return "queryPosition";
    }
    //查询部门下的职位
    @RequestMapping(value = "/queryAllPositionServlet")
    public @ResponseBody List queryAllPositionServlet(HttpServletRequest request) throws Exception{
        Integer d_id = Integer.valueOf(request.getParameter("d_id"));
        List<Position> positions = positionService.queryAllPositionByDid(d_id);
        return positions;
    }


}
