package com.example.employeepayroll.entities;

import com.example.employeepayroll.employee_payroll.domain.response.EmployeeAllowancesResponse;
import lombok.Data;

@Data
public class GenericResponse {
    private String employeeCode;
    private String employeeNumber;
    private String employeeFullName;
    private String employeeEmailAddress;
    private String employeeRole;
    private EmployeeAllowancesResponse employeeAllowances = new EmployeeAllowancesResponse();
    private String employeeNetSalary;
    private String employeeGrossSalary;
}
