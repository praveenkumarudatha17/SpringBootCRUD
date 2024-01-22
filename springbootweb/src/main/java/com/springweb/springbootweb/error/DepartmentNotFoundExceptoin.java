package com.springweb.springbootweb.error;

import com.springweb.springbootweb.entity.Department;

public class DepartmentNotFoundExceptoin extends Exception{
    public DepartmentNotFoundExceptoin(){
        super();
    }
    public DepartmentNotFoundExceptoin(String message){
        super(message);
    }
    public DepartmentNotFoundExceptoin(String message, Throwable cause){
        super(message, cause);
    }
    public DepartmentNotFoundExceptoin(Throwable cause){
        super(cause);
    }
//    protected DepartmentNotFoundExceptoin(String message, Throwable cause)
}
