package org.example.employeesystem.services;

import org.example.employeesystem.model.Employee;

import java.util.List;

public interface
EmployeeService {
    Employee createEmployee(Employee employee);
    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmploee(Long id, Employee employee);
}


