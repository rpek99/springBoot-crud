package com.example.spring.crud.service;

import com.example.spring.crud.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeByID(long id);
    void deleteEmployeeByID(long id);
}
