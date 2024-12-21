package com.jarosinski.bootnest.employee.dao;

import com.jarosinski.bootnest.employee.entity.Employee;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EmployeeDAOImplTest {

    @Mock
    private EntityManager entityManager;

    private EmployeeDAO employeeDAO;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        employeeDAO = new EmployeeDAOImpl(entityManager);
    }

    @Test
    void testSave() {
        Employee employee = new Employee();
        employeeDAO.save(employee);
        verify(entityManager, times(1)).persist(employee);
    }

    @Test
    void testFindAll() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee());
        employees.add(new Employee());
        when(entityManager.createQuery("from Employee", Employee.class).getResultList()).thenReturn(employees);
        List<Employee> result = employeeDAO.findAll();
        assertEquals(employees, result);
    }

    @Test
    void testFindById() {
        int id = 1;
        Employee employee = new Employee();
        when(entityManager.find(Employee.class, id)).thenReturn(employee);
        Employee result = employeeDAO.findById(id);
        assertEquals(employee, result);
    }

    @Test
    void testDeleteById() {
        int id = 1;
        Employee employee = new Employee();
        when(entityManager.find(Employee.class, id)).thenReturn(employee);
        employeeDAO.deleteById(id);
        verify(entityManager, times(1)).remove(employee);
    }

    @Test
    void testUpdate() {
        Employee employee = new Employee();
        when(entityManager.merge(employee)).thenReturn(employee);
        Employee result = employeeDAO.update(employee);
        assertEquals(employee, result);
    }
}