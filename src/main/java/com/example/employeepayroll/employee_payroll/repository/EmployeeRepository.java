package com.example.employeepayroll.employee_payroll.repository;

import com.example.employeepayroll.employee_payroll.domain.request.EmployeePayRollRequest;
import com.example.employeepayroll.employee_payroll.domain.response.EmployeePayRollResponse;

public interface EmployeeRepository {
 EmployeePayRollResponse verifyEmployeeDetails(EmployeePayRollRequest request);

}
