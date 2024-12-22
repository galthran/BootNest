package com.jarosinski.bootnest.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeDTO {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
}
