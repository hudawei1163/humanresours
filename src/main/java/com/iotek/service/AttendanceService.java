package com.iotek.service;

import com.iotek.model.Attendance;

import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
public interface AttendanceService {
    boolean addAttendance(Attendance attendance);
    boolean updateAttendance(Attendance attendance);
    boolean deleteAttendance(Attendance attendance);
    List<Attendance> queryAllAttendance();
    Attendance queryAttendance(Attendance attendance);
}
