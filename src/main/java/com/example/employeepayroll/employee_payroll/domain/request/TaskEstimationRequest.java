package com.example.employeepayroll.employee_payroll.domain.request;

import com.example.employeepayroll.employee_payroll.domain.EmployeeKeyData;
import lombok.Data;

@Data
public class TaskEstimationRequest {

    private EmployeeKeyData employeeKeyData = new EmployeeKeyData();
}
