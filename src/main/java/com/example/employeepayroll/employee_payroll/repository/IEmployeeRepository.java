package com.example.employeepayroll.employee_payroll.repository;

import com.example.employeepayroll.employee_payroll.DTO.EmployeeRequestDTO;
import com.example.employeepayroll.employee_payroll.DTO.EmployeeResponseDTO;

public interface IEmployeeRepository {
 EmployeeResponseDTO verifyEmployeeDetails(EmployeeRequestDTO request);

}
