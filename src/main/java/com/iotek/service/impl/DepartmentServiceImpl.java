package com.iotek.service.impl;

import com.iotek.dao.DepartmentDao;
import com.iotek.model.Department;
import com.iotek.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentDao departmentDao;
    @Override
    public boolean addDepartment(Department department) {
        return departmentDao.addDepartment(department);
    }

    @Override
    public boolean updateDepartment(Department department) {
        return departmentDao.updateDepartment(department);
    }

    @Override
    public boolean deleteDepartment(Department department) {
        return departmentDao.deleteDepartment(department);
    }

    @Override
    public List<Department> queryAllDepartment() {
        return departmentDao.queryAllDepartment();
    }

    @Override
    public Department queryDepartment(Department department) {
        return departmentDao.queryDepartment(department);
    }
}
