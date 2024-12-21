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

   /*@ExceptionHandler
    public ResponseEntity<StudentErrorResponseDTO> handleException(StudentNotFoundException exception) {

        StudentErrorResponseDTO error = new StudentErrorResponseDTO();
        error.setStatus(404);
        error.setMessage(exception.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return ResponseEntity.status(404).body(error);
    }*/

    /*@ExceptionHandler
    public ResponseEntity<StudentErrorResponseDTO> handleException(Exception exception) {

        StudentErrorResponseDTO error = new StudentErrorResponseDTO();
        error.setStatus(400);
        error.setMessage(exception.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return ResponseEntity.status(400).body(error);
    }*/

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
