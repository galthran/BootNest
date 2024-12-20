package com.jarosinski.bootnest.service;

import com.jarosinski.bootnest.dao.StudentDAO;
import com.jarosinski.bootnest.dto.StudentDTO;
import com.jarosinski.bootnest.entity.Student;
import com.jarosinski.bootnest.exception.StudentNotFoundException;
import com.jarosinski.bootnest.mapper.StudentMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentDAO studentDAO;

    private final StudentMapper studentMapper;

    public List<StudentDTO> getAllStudents() {
        return studentDAO.findAll().stream().map(studentMapper::getStudentDTO).toList();
    }

    public StudentDTO getStudentById(int id) {
        Student student = studentDAO.findById(id);

        if(student == null) {
            throw new StudentNotFoundException("Student with id " + id + " not found");
        }

        return studentMapper.getStudentDTO(student);
    }
}
