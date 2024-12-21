package com.jarosinski.bootnest.employee.dao;

import com.jarosinski.bootnest.employee.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    void save(Employee employee);

    List<Employee> findAll();

    Employee findById(int id);

    void deleteById(int id);

    Employee update(Employee employee);
}
