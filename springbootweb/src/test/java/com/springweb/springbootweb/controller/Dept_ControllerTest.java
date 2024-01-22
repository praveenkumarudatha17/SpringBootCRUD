package com.springweb.springbootweb.controller;

import com.springweb.springbootweb.entity.Department;
import com.springweb.springbootweb.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.web.servlet.function.RequestPredicates.contentType;

@WebMvcTest(Dept_Controller.class)
class Dept_ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DepartmentService departmentService;

    private Department department;

    @BeforeEach
    void setUp() {
        Department department = Department.builder().departmentId(1L).departmentName("IT").departmentAdderess("KDKR").departmentCode("IT-90").build();
    }

//    @Test
//    void saveDepartment() throws Exception {
//        Department inputDepartment = Department.builder().departmentName("ECE").departmentAdderess("PRAKASAM").departmentCode("ECE-06").build();
//        Mockito.when(departmentService.saveDepartment(inputDepartment)).thenReturn(inputDepartment);
//        mockMvc.perform(MockMvcRequestBuilders.post("/departments").contentType(MediaType.APPLICATION_JSON).content("{\n" +
//                "    \"departmentId\": 1,\n" +
//                "    \"departmentName\": \"ECE\",\n" +
//                "    \"departmentAdderess\": \"PRAKASAM\",\n" +
//                "    \"departmentCode\": \"ECE-06\"\n" +
//                "}")).andExpect(MockMvcResultMatchers.status());
//    }

    @Test
    void fetchDepartmentById() {
    }
}