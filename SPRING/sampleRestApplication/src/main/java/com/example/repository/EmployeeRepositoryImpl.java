package com.example.repository;

import com.example.Model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{
    Employee employee=new Employee();
    public Employee getEmployee(){
        employee.setAddress("Colombo");
        employee.setAge(10);
        employee.setName("Kasun123");
        return employee;
    }

}
