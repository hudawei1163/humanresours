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
    public List<Attendance> queryAllAttendance() {
        return attendanceDao.queryAllAttendance();
    }

    @Override
    public List<Attendance> queryStaffAllAttendance(int s_id) {
        return attendanceDao.queryStaffAllAttendance(s_id);
    }

    @Override
    public int queryNormalDays(int s_id) {
        return attendanceDao.queryNormalDays(s_id);
    }

    @Override
    public int queryLateDays(int s_id) {
        return attendanceDao.queryLateDays(s_id);
    }

    @Override
    public int queryEarlyDays(int s_id) {
        return attendanceDao.queryEarlyDays(s_id);
    }


}
