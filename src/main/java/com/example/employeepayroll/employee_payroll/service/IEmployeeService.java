package com.example.employeepayroll.employee_payroll.service;

import com.example.employeepayroll.employee_payroll.DTO.EmployeeRequestDTO;
import com.example.employeepayroll.employee_payroll.DTO.EmployeeResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface IEmployeeService {
    public static Logger logger = LoggerFactory.getLogger(IEmployeeService.class);
    EmployeeResponseDTO saveEmployee (EmployeeRequestDTO request);
    EmployeeResponseDTO fetchAllEmployee (EmployeeRequestDTO request);

}
