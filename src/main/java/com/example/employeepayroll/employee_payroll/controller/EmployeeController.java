package com.example.employeepayroll.employee_payroll.controller;

import com.example.employeepayroll.employee_payroll.DTO.EmployeeRequestDTO;
import com.example.employeepayroll.employee_payroll.DTO.EmployeeResponseDTO;
import com.example.employeepayroll.employee_payroll.repository.EmployeeRepositoryImpl;
import com.example.employeepayroll.employee_payroll.service.EmployeeServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
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

    @GetMapping("/add")
    public ResponseEntity<EmployeeResponseDTO> addEmployee(@RequestBody EmployeeRequestDTO requestDTO){
        EmployeeResponseDTO responseDTO = employeeRepository.verifyEmployeeDetails(requestDTO);
      if (Objects.equals(responseDTO.getHostHeaderResponse().getResponseCode(), "000")){
          return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
      }
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseDTO);
    }

}
