package com.springweb.springbootweb.service;

import com.springweb.springbootweb.entity.Department;
import com.springweb.springbootweb.error.DepartmentNotFoundExceptoin;
import com.springweb.springbootweb.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList(){
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundExceptoin {
        Optional<Department> department = departmentRepository.findById(departmentId);
        if (!department.isPresent()){
            throw new DepartmentNotFoundExceptoin("Dept not available");
        }
        return department.get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department dcbdb = departmentRepository.findById(departmentId).get();
        System.out.println("Got the items" + dcbdb.getDepartmentName() + "and" + department);
        if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())){
            dcbdb.setDepartmentCode(department.getDepartmentCode());
        }
        if(Objects.nonNull(department.getDepartmentAdderess()) && !"".equalsIgnoreCase(department.getDepartmentAdderess())){
            dcbdb.setDepartmentAdderess(department.getDepartmentAdderess());
        }
        if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())){
            dcbdb.setDepartmentName(department.getDepartmentName());
        }

        return departmentRepository.save(dcbdb);
    }

    @Override
    public Department fetchDepartmentByName(String depatmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(depatmentName);
    }
}
