package com.example.employeepayroll.employee_payroll.controller;

import com.example.employeepayroll.employee_payroll.domain.request.EmployeePayRollRequest;
import com.example.employeepayroll.employee_payroll.domain.response.EmployeePayRollResponse;
import com.example.employeepayroll.employee_payroll.repository.EmployeeRepositoryImpl;
import com.example.employeepayroll.employee_payroll.service.EmployeeServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private static Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    private final EmployeeServiceImpl employeeService;
    private final EmployeeRepositoryImpl employeeRepository;

    public EmployeeController(EmployeeServiceImpl employeeService, EmployeeRepositoryImpl employeeRepository) {
        this.employeeService = employeeService;
        this.employeeRepository = employeeRepository;
    }

    @PostMapping("/payroll")
    public ResponseEntity<EmployeePayRollResponse> employeePayRoll(@RequestBody EmployeePayRollRequest employeePayRollRequest){
        EmployeePayRollResponse response = employeeRepository.verifyEmployeeDetails(employeePayRollRequest);
      if (Objects.equals(response.getApiResponse().getResponseCode(), "000")){
          return ResponseEntity.status(HttpStatus.CREATED).body(response);
      }
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    //TODO expose api to generate employee allowance, estimated task and salary independently.
}
