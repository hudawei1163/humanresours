package com.iotek.controller;

import com.iotek.model.Attendance;
import com.iotek.model.Staff;
import com.iotek.service.AttendanceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
//考勤
@Controller
public class AttendanceController {
    @Resource
    private AttendanceService attendanceService;
    //增加考勤
    @RequestMapping(value = "/addAttendance")
    public String addAttendance()throws Exception{
        return "addAttendance";
    }
    //增加考勤
    @RequestMapping(value = "/addAttendanceServlet")
    public String addAttendanceServlet(HttpServletRequest request)throws Exception{
        //获取员工id
        Integer s_id = Integer.valueOf(request.getParameter("s_id"));
        //获取今天日期
        String date=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        //通过日期查找上班时间是否为null
        List<Attendance> attendances = attendanceService.queryStaffAllAttendance(s_id);
        if (attendances.size()==0){
            //直接打上班卡
            Date date1 = new Date();
            String date2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date1);
            long time = date1.getTime();
            String upTime= date+" "+"09:00:00";//上班时间的字符串
            Date update = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(upTime);
            long time1 = update.getTime();
            String upTime1= date+" "+"12:00:00";//上班时间的字符串
            Date update1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(upTime1);
            long time2 = update1.getTime();
            String a_state=null;
            if (time<time1){
                a_state = "正常";
            }else if (time>time1&&time<time2){
                a_state = "迟到";
            }else {
                a_state = "旷工";
            }
            Attendance attendance = new Attendance(s_id,date2,"未打",a_state);
            if(attendanceService.addAttendance(attendance)){
                request.setAttribute("msg","打卡成功！"+a_state);
                return "addAttendance";
            }else{
                request.setAttribute("msg","打卡失败");
                return "addAttendance";
            }
        }
        List<Attendance> attendances1=new ArrayList<>();
        for (Attendance a:attendances){
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(a.getA_up_work());
           String sdate = new SimpleDateFormat("yyyy-MM-dd").format(date1);
            if (date.equals(sdate)){
                attendances1.add(a);
            }
        }
        //如果为null  获取当前时间和9点作比较 X<9为正常 9<X<12提示是否打迟到卡   >12旷工
        if (attendances1.size()==0){
            Date date1 = new Date();
            String date2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date1);
            long time = date1.getTime();
            String upTime= date+" "+"09:00:00";//上班时间的字符串
            Date update = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(upTime);
            long time1 = update.getTime();
            String upTime1= date+" "+"12:00:00";//上班时间的字符串
            Date update1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(upTime1);
            long time2 = update1.getTime();
            String a_state=null;
            if (time<time1){
                a_state = "正常";
            }else if (time>time1&&time<time2){
                a_state = "迟到";
            }else {
                a_state = "旷工";
            }
            Attendance attendance = new Attendance(s_id,date2,"未打",a_state);
            if(attendanceService.addAttendance(attendance)){
                request.setAttribute("msg","打卡成功！"+a_state);
                return "addAttendance";
            }else{
                request.setAttribute("msg","打卡失败");
                return "addAttendance";
            }
        }
        else{
            //如果为null  获取当前时间和6点作比较   3<x<6提示是否打早退卡   <3旷工
            Attendance attendance = attendances1.get(0);
            if("未打".equals(attendance.getA_down_work())){
                Date date1 = new Date();
                String date2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date1);
                long time = date1.getTime();
                String downTime = date+" "+"18:00:00";//下班时间的字符串
                Date downdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(downTime);
                long time1 = downdate.getTime();
                String upTime1= date+" "+"15:00:00";
                Date update1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(upTime1);
                long time2 = update1.getTime();
                String a_state=null;
                if ("旷工".equals(attendance.getA_state())){
                    a_state = "旷工";
                }else {
                    if (time>time1){
                        a_state = "正常";
                    }else if (time<time1&&time>time2){
                        if ("正常".equals(attendance.getA_state())){
                            // 查看上班状态是否为正常  是正常改为早退
                            a_state = "早退";
                        }
                    }else {
                        a_state = "旷工";
                    }
                }
                Attendance attendance1 = new Attendance(attendance.getA_id(),attendance.getS_id(),attendance.getA_up_work(),date2,a_state);
                if(attendanceService.updateAttendance(attendance1)){
                    request.setAttribute("msg","打卡成功！"+a_state);
                    return "addAttendance";
                }else{
                    request.setAttribute("msg","打卡失败");
                    return "addAttendance";
                }
            }else {
                request.setAttribute("msg","您已打过卡了");
            }
        }
        return "addAttendance";
    }

    //员工查看考勤
    @RequestMapping(value = "/queryAttendanceServlet")
    public String queryAttendanceServlet(HttpServletRequest request,HttpSession session)throws Exception{
        Staff staff = (Staff) session.getAttribute("staff");
        List<Attendance> attendances = attendanceService.queryStaffAllAttendance(staff.getS_id());
        request.setAttribute("attendances",attendances);
        return "queryAttendance";
    }
    //管理员查看考勤
    @RequestMapping(value = "/queryAllAttendanceServlet")
    public String queryAllAttendanceServlet(HttpServletRequest request)throws Exception{
        List<Attendance> attendances = attendanceService.queryAllAttendance();
        request.setAttribute("attendances",attendances);
        return "queryAllAttendance";
    }
}
