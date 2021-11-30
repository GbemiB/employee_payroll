package com.example.employeepayroll.employee_payroll.adapter;

import com.example.employeepayroll.employee_payroll.domain.request.EmployeeAllowancesRequest;
import com.example.employeepayroll.employee_payroll.domain.request.EmployeePayRollRequest;
import com.example.employeepayroll.employee_payroll.domain.response.EmployeePayRollResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class EmployeePayrollBuilder {
    public EmployeePayRollResponse payrollBuilder(EmployeePayRollRequest request) {
        EmployeePayRollResponse response = new EmployeePayRollResponse();

        response.getAccountInfo().setAccountId(request.getAccountInfo().getAccountId());
        response.getAccountInfo().setAccountName(request.getFirstName() + " " + request.getLastName());
        response.getAccountInfo().setAccountNumber(request.getAccountInfo().getAccountNumber());
        response.getAccountInfo().setAccountBVN(request.getAccountInfo().getAccountBVN());
        response.getApiResponse().setResponseCode("000");
        response.getApiResponse().setResponseMessage("SUCCESS");
        response.getGenericResponse().setEmployeeCode(request.getEmployeeNumber());
        response.getGenericResponse().setEmployeeNumber(request.getEmployeeNumber());
        response.getGenericResponse().setEmployeeFullName(request.getFirstName() + " " + request.getLastName());
        response.getGenericResponse().setEmployeeEmailAddress(request.getEmail());
        response.getGenericResponse().setEmployeeRole(request.getRole());
        response.getGenericResponse().getEmployeeAllowances().setEmployeeWardRopeAllowance("CALCULATION IN PROGRESS...");
        response.getGenericResponse().getEmployeeAllowances().setEmployeeTransportAllowance("CALCULATION IN PROGRESS...");
        response.getGenericResponse().getEmployeeAllowances().setEmployeeLunchAllowance("CALCULATION IN PROGRESS...");
        response.getGenericResponse().getEmployeeAllowances().setEmployeeMedicalAllowance("CALCULATION IN PROGRESS...");
        response.getGenericResponse().getEmployeeAllowances().setEmployeeEmergencyAllowance("CALCULATION IN PROGRESS...");
        response.getGenericResponse().setEmployeeNetSalary("CALCULATION IN PROGRESS...");
        response.getGenericResponse().setEmployeeGrossSalary("CALCULATION IN PROGRESS...");

        return response;
    }
}
