package com.jarosinski.bootnest.rest;

import com.jarosinski.bootnest.dto.StudentDTO;
import com.jarosinski.bootnest.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class StudentRestController {

    private final StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<StudentDTO>> getAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/students/{studentId}")
    public ResponseEntity<StudentDTO> getStudentByPathVariable(@PathVariable("studentId") int studentId) {
        return ResponseEntity.ok(studentService.getStudentById(studentId));
    }

    @GetMapping("/student")
    public ResponseEntity<StudentDTO> getStudentByRequestParam(@RequestParam("id") int studentId) {
        StudentDTO studentDTO = studentService.getStudentById(studentId);
        return ResponseEntity.ok(studentDTO);
    }
}
