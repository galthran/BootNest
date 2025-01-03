package com.jarosinski.bootnest.employee.dao;

import com.jarosinski.bootnest.employee.entity.Employee;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Repository
@Deprecated
public class EmployeeDAOImpl implements EmployeeDAO {

    private final EntityManager entityManager;

    @Override
    public Employee save(Employee employee) {
         return entityManager.merge(employee);
    }

    @Override
    public List<Employee> findAll() {
        return entityManager.createQuery("from Employee", Employee.class).getResultList();
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public void deleteById(int id) {
        entityManager.remove(entityManager.find(Employee.class, id));
    }
}
