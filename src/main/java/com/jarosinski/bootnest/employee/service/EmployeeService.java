package com.jarosinski.bootnest.employee.service;

import com.jarosinski.bootnest.employee.dto.EmployeeDTO;
import com.jarosinski.bootnest.employee.mapper.EmployeeMapper;
import com.jarosinski.bootnest.employee.repository.EmployeeRepository;
import com.jarosinski.bootnest.exception.EmployeeNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.jarosinski.bootnest.employee.entity.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final EmployeeMapper employeeMapper;

    @Transactional
    public EmployeeDTO save(EmployeeDTO employeeDTO) {
        Employee savedEmployee = employeeRepository.save(employeeMapper.toEmployee(employeeDTO));
        return employeeMapper.toEmployeeDTO(savedEmployee);
    }

    @Transactional(readOnly = true)
    public List<EmployeeDTO> findAll() {
        return employeeRepository.findAll().stream().map(employeeMapper::toEmployeeDTO).toList();
    }

    @Transactional(readOnly = true)
    public EmployeeDTO findById(int id) {
        return employeeRepository.findById(id)
                .map(employeeMapper::toEmployeeDTO)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee with id " + id + " not found"));
    }

    @Transactional
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}
