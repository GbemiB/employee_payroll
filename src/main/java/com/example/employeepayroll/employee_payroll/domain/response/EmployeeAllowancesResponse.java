package com.example.employeepayroll.employee_payroll.domain.response;

import lombok.Data;

@Data
public class EmployeeAllowancesResponse {

    private String employeeWardRopeAllowance;
    private String employeeTransportAllowance;
    private String employeeLunchAllowance;
    private String employeeMedicalAllowance;
    private String employeeEmergencyAllowance;
}
