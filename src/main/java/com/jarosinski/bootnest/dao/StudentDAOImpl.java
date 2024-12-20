package com.jarosinski.bootnest.dao;

import com.jarosinski.bootnest.entity.Student;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@AllArgsConstructor
public class StudentDAOImpl implements StudentDAO {

    private final EntityManager entityManager;

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    @Transactional(readOnly = true)
    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        entityManager.remove(entityManager.find(Student.class, id));
    }

    @Override
    @Transactional
    public void delete(Student student) {
        entityManager.remove(student);
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return entityManager.createQuery("from Student", Student.class).getResultList();
    }

    @Override
    @Transactional
    public int deleteAll() {
        return entityManager.createQuery("delete from Student").executeUpdate();
    }
}
