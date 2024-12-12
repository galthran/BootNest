package com.jarosinski.bootnest.dao;

import com.jarosinski.bootnest.entity.Student;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@AllArgsConstructor
public class StudentDAOImpl implements StudentDAO {

    private final EntityManager entityManager;

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }
}
