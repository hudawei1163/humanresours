package com.iotek.service.impl;

import com.iotek.dao.StaffDao;
import com.iotek.model.Staff;
import com.iotek.service.StaffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
@Service
public class StaffServiceImpl implements StaffService {
    @Resource
    private StaffDao staffDao;
    @Override
    public boolean addStaff(Staff staff) {
        return staffDao.addStaff(staff);
    }

    @Override
    public boolean updateStaff(Staff staff) {
        return staffDao.updateStaff(staff);
    }

    @Override
    public List<Staff> queryAllStaff() {
        return staffDao.queryAllStaff();
    }

    @Override
    public Staff queryStaff(Staff staff) {
        return staffDao.queryStaff(staff);
    }
}
