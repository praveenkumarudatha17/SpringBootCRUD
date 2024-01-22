package com.springweb.springbootweb.service;

import com.springweb.springbootweb.entity.Department;
import com.springweb.springbootweb.error.DepartmentNotFoundExceptoin;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundExceptoin;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String depatmentName);
}
