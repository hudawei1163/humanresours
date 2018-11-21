package com.iotek.controller;

import com.iotek.model.Cultivate;
import com.iotek.model.Staff;
import com.iotek.service.CultivateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
//培训
@Controller
public class CultivateController {
    @Resource
    private CultivateService cultivateService;
    @RequestMapping(value = "/addCultivate")
    public String addCultivate(){
        return "addCultivate";
    }
    @RequestMapping(value = "/updateCultivate")
    public String updateCultivate(HttpServletRequest request)throws Exception{
        Integer c_id = Integer.valueOf(request.getParameter("c_id"));
        Cultivate cultivate = cultivateService.queryCultivate(c_id);
        request.setAttribute("cultivate",cultivate);
        return "updateCultivate";
    }
    //增加培训
    @RequestMapping(value = "/addCultivateServlet")
    public String addCultivateServlet(HttpServletRequest request)throws Exception{
        Integer s_id = Integer.valueOf(request.getParameter("s_id"));
        String c_theme=request.getParameter("c_theme");
        String c_start_time=request.getParameter("c_start_time");
        String c_end_time=request.getParameter("c_end_time");
        String c_address=request.getParameter("c_address");
        Cultivate cultivate = new Cultivate(s_id,c_theme,c_start_time,c_end_time,c_address);
        if(cultivateService.addCultivate(cultivate)){
            request.setAttribute("msg","添加成功");
            return "admin";
        }else{
            request.setAttribute("msg","添加失败");
            return "admin";
        }
    }
    //删除培训
    @RequestMapping(value = "/deleteCultivateServlet")
    public String deleteCultivateServlet(HttpServletRequest request)throws Exception{
        Integer c_id = Integer.valueOf(request.getParameter("c_id"));
        Cultivate cultivate = cultivateService.queryCultivate(c_id);
        if(cultivateService.deleteCultivate(cultivate)){
            request.setAttribute("msg","删除成功");
            return "admin";
        }else{
            request.setAttribute("msg","删除失败");
            return "admin";
        }
    }
    //修改培训
    @RequestMapping(value = "/updateCultivateServlet")
    public String updateCultivateServlet(HttpServletRequest request)throws Exception{
        Integer c_id = Integer.valueOf(request.getParameter("c_id"));
        Integer s_id = Integer.valueOf(request.getParameter("s_id"));
        String c_theme=request.getParameter("c_theme");
        String c_start_time=request.getParameter("c_start_time");
        String c_end_time=request.getParameter("c_end_time");
        String c_address=request.getParameter("c_address");
        Cultivate cultivate = new Cultivate(c_id,s_id,c_theme,c_start_time,c_end_time,c_address);
        if(cultivateService.updateCultivate(cultivate)){
            request.setAttribute("msg","修改成功");
            return "admin";
        }else{
            request.setAttribute("msg","修改失败");
            return "admin";
        }
    }
    //管理员查看培训
    @RequestMapping(value = "/queryCultivateServlet")
    public String queryCultivateServlet(HttpServletRequest request)throws Exception{
        List<Cultivate> cultivates= cultivateService.queryAllCultivate();
        request.setAttribute("cultivates",cultivates);
        return "queryCultivate";
    }
    //员工查看培训
    @RequestMapping(value = "/queryMyCultivateServlet")
    public String queryMyCultivateServlet(HttpServletRequest request, HttpSession session)throws Exception{
        Staff staff = (Staff) session.getAttribute("staff");
        List<Cultivate> cultivates= cultivateService.queryAllStaffCultivate(staff.getS_id());
        request.setAttribute("cultivates",cultivates);
        return "queryMyCultivate";
    }
}
