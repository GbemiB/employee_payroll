package com.example.employeepayroll.employee_payroll.service;

import com.example.employeepayroll.employee_payroll.adapter.EmployeePayrollBuilder;
import com.example.employeepayroll.employee_payroll.domain.EmployeeRoles;
import com.example.employeepayroll.employee_payroll.domain.request.EmployeePayRollRequest;
import com.example.employeepayroll.employee_payroll.domain.request.TaskEstimationRequest;
import com.example.employeepayroll.employee_payroll.domain.response.EmployeePayRollResponse;
import com.example.employeepayroll.employee_payroll.domain.response.TaskEstimationResponse;
import com.example.employeepayroll.employee_payroll.repository.EmployeeRepositoryImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepositoryImpl employeeRepository;

    public EmployeeServiceImpl(EmployeeRepositoryImpl employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeePayRollResponse payrollOnboarding(EmployeePayRollRequest employeePayRollRequest) {
        EmployeePayrollBuilder resBuilder = new EmployeePayrollBuilder();
        EmployeePayRollResponse response = resBuilder.payrollBuilder(employeePayRollRequest);
        log.info(String.valueOf(response));
        return response;
    }

    @Override
    public TaskEstimationResponse generateEstimatedTask(TaskEstimationRequest request) {
        TaskEstimationResponse taskEstimationResponse = new TaskEstimationResponse();
        if(Objects.equals(request.getEmployeeRole(), EmployeeRoles.GT)){
            taskEstimationResponse.setTotalEstimatedTask("12,675 USD");
        }
        else if (Objects.equals(request.getEmployeeRole(), EmployeeRoles.ET)){
            taskEstimationResponse.setTotalEstimatedTask("15,271 USD");
        }
        else if (Objects.equals(request.getEmployeeRole(), EmployeeRoles.JE)){
        taskEstimationResponse.setTotalEstimatedTask("19,979 USD");
        }
        else if (Objects.equals(request.getEmployeeRole(), EmployeeRoles.SE)){
            taskEstimationResponse.setTotalEstimatedTask("29,975 USD");
        }
        else if (Objects.equals(request.getEmployeeRole(), EmployeeRoles.AM)){
            taskEstimationResponse.setTotalEstimatedTask("31,975 USD");
        }
        else if (Objects.equals(request.getEmployeeRole(), EmployeeRoles.MG)){
            taskEstimationResponse.setTotalEstimatedTask("39,975 USD");
        }
        else if (Objects.equals(request.getEmployeeRole(), EmployeeRoles.DR)){
            taskEstimationResponse.setTotalEstimatedTask("41,975 USD");
        }
        else if (Objects.equals(request.getEmployeeRole(), EmployeeRoles.CO)){
            taskEstimationResponse.setTotalEstimatedTask("58,975 USD");
        }

        taskEstimationResponse.setTotalEstimatedTask("INVALID EMPLOYEE ROLE");

        return taskEstimationResponse;

        // TODO INVALID EMPLOYEE ROLE IS BEEN RETURNED IN THE API CALL
    }

    @Override
    public String generateEmployeeSalary(EmployeePayRollRequest payRollRequest) {
        return null;
        //TODO logic to generate total salary factoring in allowance and estimated task
    }

}
