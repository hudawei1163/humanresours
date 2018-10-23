package com.iotek.dao;

import com.iotek.model.Staff;

import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
public interface StaffDao {
    boolean addStaff(Staff staff);
    boolean updateStaff(Staff staff);
    boolean deleteStaff(Staff staff);
    List<Staff> queryAllStaff();
    Staff queryStaff(Staff staff);
}
