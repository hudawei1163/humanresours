package com.iotek.service;

import com.iotek.model.Attendance;

import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
public interface AttendanceService {
    boolean addAttendance(Attendance attendance);
    boolean updateAttendance(Attendance attendance);
    List<Attendance> queryAllAttendance();
    List<Attendance> queryStaffAllAttendance(int s_id);
    int queryNormalDays (int s_id);//正常天数
    int queryLateDays (int s_id);//早退天数
    int queryEarlyDays (int s_id);//迟到天数
}
