package com.iotek.controller;

import com.iotek.model.Rewards;
import com.iotek.model.Staff;
import com.iotek.service.RewardsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

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
        return "addRewards";
    }
    @RequestMapping(value = "/updateRewards")
    public String updateRewards(HttpServletRequest request) throws Exception{
        Integer rw_id = Integer.valueOf(request.getParameter("rw_id"));
        Rewards rewards = rewardsService.queryRewards(rw_id);
        request.setAttribute("rewards",rewards);
        return "updateRewards";
    }
    //增加奖惩
    @RequestMapping(value = "/addRewardsServlet")
    public String addRewardsServlet(HttpServletRequest request)throws Exception{
        Integer s_id = Integer.valueOf(request.getParameter("s_id"));
        Double rw_salary = Double.valueOf(request.getParameter("rw_salary"));
        String r_reason = request.getParameter("r_reason");
        String r_date = request.getParameter("r_date");
        Rewards rewards = new Rewards(s_id,rw_salary,r_reason,r_date);
        if(rewardsService.addRewards(rewards)){
            request.setAttribute("msg","添加成功");
            return "addRewards";
        }else{
            request.setAttribute("msg","添加失败");
            return "addRewards";
        }
    }
    //修改奖惩
    @RequestMapping(value = "/updateRewardsServlet")
    public String updateRewardsServlet(HttpServletRequest request)throws Exception{
        Integer rw_id = Integer.valueOf(request.getParameter("rw_id"));
        Rewards rewards1 = rewardsService.queryRewards(rw_id);
        Double rw_salary = Double.valueOf(request.getParameter("rw_salary"));
        String r_reason = request.getParameter("r_reason");
        Rewards rewards = new Rewards(rw_id,rewards1.getS_id(),rw_salary,r_reason,rewards1.getR_date());
        if(rewardsService.updateRewards(rewards)){
            request.setAttribute("msg","修改成功");
            return "admin";
        }else{
            request.setAttribute("msg","修改失败");
            return "admin";
        }
    }
    //员工查看奖惩
    @RequestMapping(value = "/queryRewardsServlet")
    public String queryRewardsServlet(HttpServletRequest request, HttpSession session)throws Exception{
        Staff staff = (Staff) session.getAttribute("staff");
        List<Rewards> rewardsList = rewardsService.queryAllRewardsById(staff.getS_id());
        request.setAttribute("rewardsList",rewardsList);
        return "queryRewards";
    }
    //管理员查看全部奖惩
    @RequestMapping(value = "/queryAllRewardsServlet")
    public String queryAllRewardsServlet(HttpServletRequest request)throws Exception{
        List<Rewards> rewardsList = rewardsService.queryAllRewards();
        request.setAttribute("rewardsList",rewardsList);
        return "queryAllRewards";
    }

}
