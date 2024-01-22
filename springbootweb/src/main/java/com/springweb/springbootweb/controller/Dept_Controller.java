package com.springweb.springbootweb.controller;

import com.springweb.springbootweb.entity.Department;
import com.springweb.springbootweb.error.DepartmentNotFoundExceptoin;
import com.springweb.springbootweb.service.DepartmentService;
import com.springweb.springbootweb.service.DepartmentServiceImpl;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Dept_Controller {

    @Autowired
    private DepartmentService departmentService;

    private final Logger logger = LoggerFactory.getLogger(Dept_Controller.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        logger.info("We are in Save department");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        logger.info("We are in fetchDepartmentList department");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundExceptoin {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Departments deleted successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
        System.out.println("Got the items" + departmentId + "and" + department);
        return departmentService.updateDepartment(departmentId, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String depatmentName){
        return departmentService.fetchDepartmentByName(depatmentName);
    }
}
