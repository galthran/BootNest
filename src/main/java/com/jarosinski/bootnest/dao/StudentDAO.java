package com.jarosinski.bootnest.dao;

import com.jarosinski.bootnest.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById(int id);

    void deleteById(int id);

    void delete(Student student);

    void update(Student student);

    List<Student> findAll();

    int deleteAll();
}
