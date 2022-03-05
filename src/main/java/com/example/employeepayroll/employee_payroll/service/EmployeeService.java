package com.example.employeepayroll.employee_payroll.service;

import com.example.employeepayroll.employee_payroll.domain.request.EmployeeGrossSalaryRequest;
import com.example.employeepayroll.employee_payroll.domain.request.EmployeePayRollRequest;
import com.example.employeepayroll.employee_payroll.domain.request.TaskEstimationRequest;
import com.example.employeepayroll.employee_payroll.domain.response.EmployeeGrossSalaryResponse;
import com.example.employeepayroll.employee_payroll.domain.response.EmployeePayRollResponse;
import com.example.employeepayroll.employee_payroll.domain.response.TaskEstimationResponse;

public interface EmployeeService {

    EmployeePayRollResponse payrollOnboarding(EmployeePayRollRequest employeePayRollRequest);

    TaskEstimationResponse estimateTask(TaskEstimationRequest request);

    EmployeeGrossSalaryResponse generateGrossSalary(EmployeeGrossSalaryRequest request);

    String generateEmployeeSalary (EmployeePayRollRequest payRollRequest);
}
