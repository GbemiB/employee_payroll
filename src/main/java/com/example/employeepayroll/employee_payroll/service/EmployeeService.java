package com.example.employeepayroll.employee_payroll.service;

import com.example.employeepayroll.employee_payroll.domain.request.EmployeeAllowancesRequest;
import com.example.employeepayroll.employee_payroll.domain.request.EmployeePayRollRequest;
import com.example.employeepayroll.employee_payroll.domain.request.TaskEstimationRequest;
import com.example.employeepayroll.employee_payroll.domain.response.EmployeeAllowancesResponse;
import com.example.employeepayroll.employee_payroll.domain.response.TaskEstimationResponse;

public interface EmployeeService {

    EmployeeAllowancesResponse generateEstimatedTask(EmployeeAllowancesRequest allowancesRequest);
    // TODO use employeeKeyData to generate employee allowances

    TaskEstimationResponse generateEstimatedTask(TaskEstimationRequest estimationRequest);
    // TODO use employeeKeyData to generate employee estimated task

    String generateEmployeeSalary (EmployeePayRollRequest payRollRequest);
    //TODO logic to generate total salary factoring in allowance and estimated task

}
