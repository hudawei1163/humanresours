package com.iotek.service.impl;

import com.iotek.dao.SalaryDao;
import com.iotek.model.Salary;
import com.iotek.service.SalaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
@Service
public class SalaryServiceImpl implements SalaryService {
    @Resource
    private SalaryDao salaryDao;
    @Override
    public boolean addSalary(Salary salary) {
        return salaryDao.addSalary(salary);
    }

    @Override
    public boolean updateSalary(Salary salary) {
        return salaryDao.updateSalary(salary);
    }

    @Override
    public boolean deleteSalary(Salary salary) {
        return salaryDao.deleteSalary(salary);
    }

    @Override
    public List<Salary> queryAllSalary() {
        return salaryDao.queryAllSalary();
    }

    @Override
    public Salary querySalary(Salary salary) {
        return salaryDao.querySalary(salary);
    }
}
