package com.jarosinski.bootnest;

import com.jarosinski.bootnest.dao.StudentDAO;
import com.jarosinski.bootnest.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication()
public class BootNestApplication {

    private static final Logger logger = Logger.getLogger(BootNestApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(BootNestApplication.class, args);
    }

    /*@Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return args -> createStudent(studentDAO);
    }*/

    private void createStudent(StudentDAO studentDAO) {
        logger.info("Creating student");
        Student student = new Student("Julia", "Lisowska", "julisowska@example.com");

        logger.info("Saving student");
        studentDAO.save(student);

        logger.info("Saved student. Generated id: " + student.getId());
    }

    private void getStudent(StudentDAO studentDAO, int id) {
        logger.info("Getting student");
        Student student = studentDAO.findById(id);
        logger.info("Found student: " + student);
    }

    private void deleteStudent(StudentDAO studentDAO, int id) {
        logger.info("Deleting student");
        try {
            studentDAO.deleteById(id);
        } catch (Exception e) {
            logger.info("Student not found");
        }
        logger.info("Deleted student");
    }
}
