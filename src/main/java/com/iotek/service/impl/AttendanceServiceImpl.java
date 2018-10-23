package com.iotek.service.impl;

import com.iotek.dao.AttendanceDao;
import com.iotek.model.Attendance;
import com.iotek.service.AttendanceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
@Service
public class AttendanceServiceImpl implements AttendanceService {
    @Resource
    private AttendanceDao attendanceDao;
    @Override
    public boolean addAttendance(Attendance attendance) {
        return attendanceDao.addAttendance(attendance);
    }

    @Override
    public boolean updateAttendance(Attendance attendance) {
        return attendanceDao.updateAttendance(attendance);
    }

    @Override
    public boolean deleteAttendance(Attendance attendance) {
        return attendanceDao.deleteAttendance(attendance);
    }

    @Override
    public List<Attendance> queryAllAttendance() {
        return attendanceDao.queryAllAttendance();
    }

    @Override
    public Attendance queryAttendance(Attendance attendance) {
        return attendanceDao.queryAttendance(attendance);
    }
}
