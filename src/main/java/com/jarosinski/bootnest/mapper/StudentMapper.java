package com.jarosinski.bootnest.mapper;

import com.jarosinski.bootnest.dto.StudentDTO;
import com.jarosinski.bootnest.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public StudentDTO getStudentDTO(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setFirstName(student.getFirstName());
        studentDTO.setLastName(student.getLastName());
        return studentDTO;
    }

    public Student getStudent(StudentDTO studentDTO) {
        Student student = new Student();
        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        return student;
    }
}
