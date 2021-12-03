package com.example.employeepayroll.employee_payroll.controller;

import com.example.employeepayroll.employee_payroll.domain.request.TaskEstimationRequest;
import com.example.employeepayroll.employee_payroll.domain.response.TaskEstimationResponse;
import com.example.employeepayroll.employee_payroll.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/employee")
public class TaskEstimationController {
    private final EmployeeService employeeService;

    public TaskEstimationController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/task")
    public ResponseEntity<TaskEstimationResponse> estimateTask(@RequestBody String employeeRole){
        TaskEstimationResponse response = employeeService.generateEstimatedTask(employeeRole);
            return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
