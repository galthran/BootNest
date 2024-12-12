package com.jarosinski.bootnest;

import com.jarosinski.bootnest.dao.StudentDAO;
import com.jarosinski.bootnest.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

@SpringBootApplication()
public class BootNestApplication {

    private static final Logger logger = Logger.getLogger(BootNestApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(BootNestApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return args -> createStudent(studentDAO);
    }

    private void createStudent(StudentDAO studentDAO) {
        logger.info("Creating student");
        Student student = new Student("John", "Doe", "n8t9S@example.com");

        logger.info("Saving student");
        studentDAO.save(student);

        logger.info("Saved student. Generated id: " + student.getId());
    }
}
