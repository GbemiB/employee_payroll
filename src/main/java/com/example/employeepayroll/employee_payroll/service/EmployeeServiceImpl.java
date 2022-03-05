package com.example.employeepayroll.employee_payroll.service;

import com.example.employeepayroll.employee_payroll.adapter.EmployeePayrollBuilder;
import com.example.employeepayroll.employee_payroll.domain.Employee;
import com.example.employeepayroll.employee_payroll.domain.request.EmployeeGrossSalaryRequest;
import com.example.employeepayroll.employee_payroll.domain.request.EmployeePayRollRequest;
import com.example.employeepayroll.employee_payroll.domain.request.TaskEstimationRequest;
import com.example.employeepayroll.employee_payroll.domain.response.EmployeeGrossSalaryResponse;
import com.example.employeepayroll.employee_payroll.domain.response.EmployeePayRollResponse;
import com.example.employeepayroll.employee_payroll.domain.response.TaskEstimationResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public EmployeePayRollResponse payrollOnboarding(EmployeePayRollRequest employeePayRollRequest) {
        EmployeePayrollBuilder resBuilder = new EmployeePayrollBuilder();
        EmployeePayRollResponse response = resBuilder.payrollBuilder(employeePayRollRequest);
        return response;
    }

    @Override
    public TaskEstimationResponse estimateTask(TaskEstimationRequest request) {
        TaskEstimationResponse response = new TaskEstimationResponse();
        if(Objects.equals(request.getEmployeeRole(), "GT")){
            response.setTotalEstimatedTask(Employee.GT.getTask() + " " + Employee.GT.getSalaryCurrency());
        }
        else if (Objects.equals(request.getEmployeeRole(), "ET")){
            response.setTotalEstimatedTask(Employee.ET.getTask() + " " + Employee.ET.getSalaryCurrency());
        }
        else if (Objects.equals(request.getEmployeeRole(), "JE")){
        response.setTotalEstimatedTask(Employee.JE.getTask()  + " " + Employee.JE.getSalaryCurrency());
        }
        else if (Objects.equals(request.getEmployeeRole(), "SE")){
            response.setTotalEstimatedTask(Employee.SE.getTask() + " " + Employee.SE.getSalaryCurrency());
        }
        else if (Objects.equals(request.getEmployeeRole(), "AM")){
            response.setTotalEstimatedTask(Employee.AM.getTask() + " " + Employee.AM.getSalaryCurrency());
        }
        else if (Objects.equals(request.getEmployeeRole(), "MG")){
            response.setTotalEstimatedTask(Employee.MG.getTask() + " " + Employee.MG.getSalaryCurrency());
        }
        else if (Objects.equals(request.getEmployeeRole(), "DR")){
            response.setTotalEstimatedTask(Employee.DR.getTask() + " " + Employee.DR.getSalaryCurrency());
        }
        else if (Objects.equals(request.getEmployeeRole(), "CO")){
            response.setTotalEstimatedTask(Employee.CO.getTask() + " " + Employee.CO.getSalaryCurrency());
        } else {
            response.setTotalEstimatedTask("INVALID EMPLOYEE ROLE");
        }

        return response;
    }

    @Override
    public EmployeeGrossSalaryResponse generateGrossSalary(EmployeeGrossSalaryRequest request) {
        EmployeeGrossSalaryResponse response = new EmployeeGrossSalaryResponse();
        if(Objects.equals(request.getEmployeeRole(), "GT")){
            response.setGrossSalary(Employee.GT.getGrossSalary() + " " + Employee.GT.getSalaryCurrency());
        }
        else if (Objects.equals(request.getEmployeeRole(), "ET")){
            response.setGrossSalary(Employee.ET.getGrossSalary() + " " + Employee.ET.getSalaryCurrency());
        }
        else if (Objects.equals(request.getEmployeeRole(), "JE")){
            response.setGrossSalary(Employee.JE.getGrossSalary() + " " + Employee.JE.getSalaryCurrency());
        }
        else if (Objects.equals(request.getEmployeeRole(), "SE")){
            response.setGrossSalary(Employee.SE.getGrossSalary() + " " + Employee.SE.getSalaryCurrency());
        }
        else if (Objects.equals(request.getEmployeeRole(), "AM")){
            response.setGrossSalary(Employee.AM.getGrossSalary() + " " + Employee.AM.getSalaryCurrency());

        }
        else if (Objects.equals(request.getEmployeeRole(), "MG")){
            response.setGrossSalary(Employee.MG.getGrossSalary() + " " + Employee.MG.getSalaryCurrency());
        }
        else if (Objects.equals(request.getEmployeeRole(), "DR")){
            response.setGrossSalary(Employee.DR.getGrossSalary() + " " + Employee.DR.getSalaryCurrency());
        }
        else if (Objects.equals(request.getEmployeeRole(), "CO")){
            response.setGrossSalary(Employee.CO.getGrossSalary() + " " + Employee.CO.getSalaryCurrency());
        } else {
            response.setGrossSalary("INVALID EMPLOYEE ROLE");
        }
        return response;
    }

    @Override
    public String generateEmployeeSalary(EmployeePayRollRequest payRollRequest) {
        return null;
        //TODO logic to generate total salary factoring in allowance and estimated task
    }

}
