package com.jarosinski.bootnest.employee.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="first_name", nullable = false, length = 32)
    private String firstName;

    @Column(name="last_name", nullable = false, length = 64)
    private String lastName;

    @Column(name="email", length = 256)
    private String email;
}
