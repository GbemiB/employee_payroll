package com.example.employeepayroll.employee_payroll.service;

import com.example.employeepayroll.employee_payroll.adapter.EmployeePayrollBuilder;
import com.example.employeepayroll.employee_payroll.domain.request.EmployeeAllowancesRequest;
import com.example.employeepayroll.employee_payroll.domain.request.EmployeePayRollRequest;
import com.example.employeepayroll.employee_payroll.domain.request.TaskEstimationRequest;
import com.example.employeepayroll.employee_payroll.domain.response.EmployeePayRollResponse;
import com.example.employeepayroll.employee_payroll.domain.response.TaskEstimationResponse;
import com.example.employeepayroll.employee_payroll.repository.EmployeeRepositoryImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepositoryImpl employeeRepository;

    public EmployeeServiceImpl(EmployeeRepositoryImpl employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeePayRollResponse payrollOnboarding(EmployeePayRollRequest employeePayRollRequest) {
        EmployeePayrollBuilder resBuilder = new EmployeePayrollBuilder();
        EmployeePayRollResponse response = resBuilder.payrollBuilder(employeePayRollRequest);
        log.info(String.valueOf(response));
        return response;
    }

    @Override
    public TaskEstimationResponse generateEstimatedAllowance(TaskEstimationRequest estimationRequest) {
        return null;
        //TODO implement service to generate/calculate employee estimated task
    }

    @Override
    public String generateEmployeeSalary(EmployeePayRollRequest payRollRequest) {
        return null;
        //TODO logic to generate total salary factoring in allowance and estimated task
    }

}
