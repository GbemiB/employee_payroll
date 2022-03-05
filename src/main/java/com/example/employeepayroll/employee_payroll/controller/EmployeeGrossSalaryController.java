package com.example.employeepayroll.employee_payroll.controller;

import com.example.employeepayroll.employee_payroll.domain.request.EmployeeGrossSalaryRequest;
import com.example.employeepayroll.employee_payroll.domain.request.EmployeePayRollRequest;
import com.example.employeepayroll.employee_payroll.domain.request.TaskEstimationRequest;
import com.example.employeepayroll.employee_payroll.domain.response.EmployeeGrossSalaryResponse;
import com.example.employeepayroll.employee_payroll.domain.response.TaskEstimationResponse;
import com.example.employeepayroll.employee_payroll.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeGrossSalaryController {
    private final EmployeeService employeeService;

    public EmployeeGrossSalaryController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping("/grossSalary")
    public ResponseEntity<EmployeeGrossSalaryResponse> estimateGrossSalary(@RequestBody EmployeeGrossSalaryRequest request){
        EmployeeGrossSalaryResponse response = employeeService.generateGrossSalary(request);
        log.info("Gross Salary Request {} ", request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
