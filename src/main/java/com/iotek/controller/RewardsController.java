package com.iotek.controller;

import com.iotek.service.RewardsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by lenovo on 2018/10/22.
 */
//奖惩
@Controller
public class RewardsController {
    @Resource
    private RewardsService rewardsService;
    @RequestMapping(value = "/addRewards")
    public String addRewards(){
        return "addIRewards";
    }
    @RequestMapping(value = "/updateRewards")
    public String updateRewards(){
        return "updateRewards";
    }
    //增加奖惩
    @RequestMapping(value = "/addRewardsServlet")
    public String addRewardsServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //修改奖惩
    @RequestMapping(value = "/updateRewardsServlet")
    public String updateRewardsServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
    //查看奖惩
    @RequestMapping(value = "/queryRewardsServlet")
    public String queryRewardsServlet(HttpServletRequest request)throws Exception{
        return "admin";
    }
}
