package com.example.employeepayroll.employee_payroll.service;

import com.example.employeepayroll.employee_payroll.domain.request.EmployeePayRollRequest;
import com.example.employeepayroll.employee_payroll.domain.request.TaskEstimationRequest;
import com.example.employeepayroll.employee_payroll.domain.response.EmployeePayRollResponse;
import com.example.employeepayroll.employee_payroll.domain.response.TaskEstimationResponse;

public interface EmployeeService {

    EmployeePayRollResponse payrollOnboarding(EmployeePayRollRequest employeePayRollRequest);

    TaskEstimationResponse generateEstimatedTask(TaskEstimationRequest request);

    String generateEmployeeSalary (EmployeePayRollRequest payRollRequest);
    //TODO logic to generate total salary factoring in allowance and estimated task

}
