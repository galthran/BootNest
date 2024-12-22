package com.jarosinski.bootnest.employee.rest;

import com.jarosinski.bootnest.employee.dto.EmployeeDTO;
import com.jarosinski.bootnest.employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeRestController {

    private final EmployeeService employeeService;

    /*@GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("id") int id) {
        EmployeeDTO employeeDTO = employeeService.findById(id);
        return ResponseEntity.ok(employeeDTO);
    }

    @PostMapping
    public ResponseEntity<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        EmployeeDTO createdEmployeeDTO = employeeService.save(employeeDTO);
        return ResponseEntity.ok(createdEmployeeDTO);
    }

    @PutMapping
    public ResponseEntity<EmployeeDTO> updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
        EmployeeDTO updatedEmployeeDTO = employeeService.save(employeeDTO);
        return ResponseEntity.ok(updatedEmployeeDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("id") int id) {
        employeeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }*/
}
