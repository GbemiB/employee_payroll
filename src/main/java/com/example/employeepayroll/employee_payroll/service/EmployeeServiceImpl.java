package com.example.employeepayroll.employee_payroll.service;

import com.example.employeepayroll.employee_payroll.DTO.EmployeeRequestDTO;
import com.example.employeepayroll.employee_payroll.DTO.EmployeeResponseDTO;
import com.example.employeepayroll.employee_payroll.repository.EmployeeRepositoryImpl;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
    private final EmployeeRepositoryImpl employeeRepository;

    public EmployeeServiceImpl(EmployeeRepositoryImpl employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeResponseDTO saveEmployee(EmployeeRequestDTO request) {
        return null;
    }

    @Override
    public EmployeeResponseDTO fetchAllEmployee(EmployeeRequestDTO request) {
        return null;
    }
}
