package com.jarosinski.bootnest.rest;

import com.jarosinski.bootnest.dto.StudentErrorResponseDTO;
import com.jarosinski.bootnest.exception.StudentNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<StudentErrorResponseDTO> handleException(StudentNotFoundException exception) {

        StudentErrorResponseDTO error = new StudentErrorResponseDTO();
        error.setStatus(404);
        error.setMessage(exception.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return ResponseEntity.status(404).body(error);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<StudentErrorResponseDTO> handleException(Exception exception) {

        StudentErrorResponseDTO error = new StudentErrorResponseDTO();
        error.setStatus(400);
        error.setMessage(exception.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return ResponseEntity.status(400).body(error);
    }
}
