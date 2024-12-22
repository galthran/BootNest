package com.jarosinski.bootnest.employee.dao;

import com.jarosinski.bootnest.employee.entity.Employee;

import java.util.List;

@Deprecated
public interface EmployeeDAO {

    Employee save(Employee employee);

    List<Employee> findAll();

    Employee findById(int id);

    void deleteById(int id);
}
