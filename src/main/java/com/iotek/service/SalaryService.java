package com.iotek.service;

import com.iotek.model.Salary;

import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
public interface SalaryService {
    boolean addSalary(Salary salary);
    boolean updateSalary(Salary salary);
    boolean deleteSalary(Salary salary);
    List<Salary> queryAllSalary();
    Salary querySalary(int sl_id);
    List<Salary> queryStaffSalary(int s_id);
}
