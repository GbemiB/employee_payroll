package com.example.employeepayroll.employee_payroll.domain.response;

import com.example.employeepayroll.employee_payroll.domain.AccountInfo;
import com.example.employeepayroll.employee_payroll.domain.ApiResponse;
import com.example.employeepayroll.entities.GenericResponse;
import lombok.Data;

@Data
public class EmployeePayRollResponse {

    private AccountInfo accountInfo = new AccountInfo();
    private GenericResponse Response = new GenericResponse();
    private ApiResponse apiResponse = new ApiResponse();


    //TODO Build response that will be returned
}
