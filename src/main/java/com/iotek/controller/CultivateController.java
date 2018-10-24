package com.iotek.controller;

import com.iotek.service.CultivateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
    public String updateCultivate(){
        return "updateCultivate";
    }
    //增加培训
    @RequestMapping(value = "/addCultivateServlet")
    public String addCultivateServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //删除培训
    @RequestMapping(value = "/deleteCultivateServlet")
    public String deleteCultivateServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //修改培训
    @RequestMapping(value = "/updateCultivateServlet")
    public String updateCultivateServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //查看培训
    @RequestMapping(value = "/queryCultivateServlet")
    public String queryCultivateServlet(HttpServletRequest request)throws Exception{
        return "staff";
    }
}
