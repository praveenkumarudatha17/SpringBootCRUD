package com.springweb.springbootweb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Service;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentId;
    @NotBlank(message = "Please add the department name")
//    @Length(max = 5, min = 1)
//    @Size(max = 5, min = 1)
//    @Email
//    @PositiveOrZero
//    @NegativeOrZero
//    @Future
//    @Past
    private String departmentName;
    private String departmentAdderess;
    private String departmentCode;

//    @Override
//    public String toString(){
//        return "{ DepartmentId :" + departmentId + "departmentName :" + departmentName + "departmentAdderess :" + departmentAdderess + "departmentCode" + departmentCode +"}";
//    }
//    public Department(int departmentId, String departmentName, String departmentAdderess, String departmentCode){
//        this.departmentId = departmentId;
//        this.departmentName = departmentName;
//        this.departmentAdderess = departmentAdderess;
//        this.departmentCode = departmentCode;
//    }
//
//    public Department(){}
//
//
//    public String getDepartmentCode() {
//        return departmentCode;
//    }
//
//    public void setDepartmentCode(String departmentCode) {
//        this.departmentCode = departmentCode;
//    }
//
//    public String getDepartmentAdderess() {
//        return departmentAdderess;
//    }
//
//    public void setDepartmentAdderess(String departmentAdderess) {
//        this.departmentAdderess = departmentAdderess;
//    }
//
//    public String getDepartmentName() {
//        return departmentName;
//    }
//
//    public void setDepartmentName(String departmentName) {
//        this.departmentName = departmentName;
//    }
//
//    public int getDepartmentId() {
//        return departmentId;
//    }
//
//    public void setDepartmentId(int departmentId) {
//        this.departmentId = departmentId;
//    }
}
