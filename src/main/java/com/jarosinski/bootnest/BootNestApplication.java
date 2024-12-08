package com.jarosinski.bootnest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jarosinski.bootnest")
public class BootNestApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootNestApplication.class, args);
    }

}
