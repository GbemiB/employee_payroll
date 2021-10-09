package com.example.employeepayroll.employee_payroll.domain.request;
import com.example.employeepayroll.employee_payroll.domain.AccountInfo;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
public class EmployeePayRollRequest {
    @JsonIgnoreProperties(ignoreUnknown = true)
    private String  idNumber;
    private String employeeNumber;
    private String role;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String middleName;
    @JsonFormat(pattern = "YYYY-MM-DD")
    private String dateOfBirth;
    private AccountInfo accountInfo = new AccountInfo();

}
