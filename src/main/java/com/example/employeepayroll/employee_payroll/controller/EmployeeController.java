package com.example.employeepayroll.employee_payroll.controller;

import com.example.employeepayroll.employee_payroll.domain.request.EmployeePayRollRequest;
import com.example.employeepayroll.employee_payroll.domain.response.EmployeePayRollResponse;
import com.example.employeepayroll.employee_payroll.repository.EmployeeRepositoryImpl;
import com.example.employeepayroll.employee_payroll.service.EmployeeService;
import com.example.employeepayroll.employee_payroll.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;
    private final EmployeeRepositoryImpl employeeRepository;

    public EmployeeController(EmployeeServiceImpl employeeService, EmployeeRepositoryImpl employeeRepository) {
        this.employeeService = employeeService;
        this.employeeRepository = employeeRepository;
    }

    @PostMapping("/payroll")
    public ResponseEntity<EmployeePayRollResponse> employeePayRoll(@RequestBody EmployeePayRollRequest employeePayRollRequest){
        EmployeePayRollResponse response = employeeService.payrollOnboarding(employeePayRollRequest);
      if (Objects.equals(response.getApiResponse().getResponseCode(), "000")){
          return ResponseEntity.status(HttpStatus.OK).body(response);
      }
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

}
