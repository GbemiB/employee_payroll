package com.example.employeepayroll.employee_payroll.service;

import com.example.employeepayroll.employee_payroll.domain.request.EmployeeAllowancesRequest;
import com.example.employeepayroll.employee_payroll.domain.request.EmployeePayRollRequest;
import com.example.employeepayroll.employee_payroll.domain.request.TaskEstimationRequest;
import com.example.employeepayroll.employee_payroll.domain.response.EmployeeAllowancesResponse;
import com.example.employeepayroll.employee_payroll.domain.response.TaskEstimationResponse;
import com.example.employeepayroll.employee_payroll.repository.EmployeeRepositoryImpl;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepositoryImpl employeeRepository;

    public EmployeeServiceImpl(EmployeeRepositoryImpl employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeAllowancesResponse generateEstimatedTask(EmployeeAllowancesRequest allowancesRequest) {
        return null;
        //TODO implement service to generate/calculate employee allowances
    }

    @Override
    public TaskEstimationResponse generateEstimatedTask(TaskEstimationRequest estimationRequest) {
        return null;
        //TODO implement service to generate/calculate employee estimated task
    }

    @Override
    public String generateEmployeeSalary(EmployeePayRollRequest payRollRequest) {
        return null;
        //TODO logic to generate total salary factoring in allowance and estimated task
    }

}
