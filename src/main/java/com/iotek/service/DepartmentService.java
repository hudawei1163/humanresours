package com.iotek.service;

import com.iotek.model.Department;

import java.util.List;

/**
 * Created by lenovo on 2018/10/22.
 */
public interface DepartmentService {
    boolean addDepartment(Department department);
    boolean updateDepartment(Department department);
    boolean deleteDepartment(Department department);
    List<Department> queryAllDepartment();
    Department queryDepartment(Department department);
}
