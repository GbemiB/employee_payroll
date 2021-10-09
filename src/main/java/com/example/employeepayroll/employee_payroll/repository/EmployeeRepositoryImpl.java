package com.example.employeepayroll.employee_payroll.repository;

import com.example.employeepayroll.employee_payroll.domain.request.EmployeePayRollRequest;
import com.example.employeepayroll.employee_payroll.domain.response.EmployeePayRollResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.Objects;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    Logger logger = LoggerFactory.getLogger(EmployeeRepositoryImpl.class);

    @Override
    public EmployeePayRollResponse verifyEmployeeDetails(EmployeePayRollRequest request) {
        EmployeePayRollResponse response = new EmployeePayRollResponse();

        if (Objects.isNull(request.getFirstName()) || (Objects.isNull(request.getFirstName().trim().isEmpty()))) {
            response.getApiResponse().setResponseMessage("Employee first name cannot be empty");
          }

          if (Objects.isNull(request.getLastName()) || (Objects.isNull(request.getFirstName().trim().isEmpty()))) {
              response.getApiResponse().setResponseMessage("Employee last name cannot be empty");
          }

          if (Objects.isNull(request.getEmail()) || (Objects.isNull(request.getEmail().trim().isEmpty()))) {
              response.getApiResponse().setResponseMessage("Email address cannot be empty");
          }

        if (Objects.isNull(request.getEmployeeNumber()) || (Objects.isNull(request.getEmail().trim().isEmpty()))) {
            response.getApiResponse().setResponseMessage("Employee number cannot be empty");
        }

        if (Objects.isNull(request.getAccountInfo().getAccountId()) || (Objects.isNull(request.getEmail().trim().isEmpty()))) {
            response.getApiResponse().setResponseMessage("Account id cannot be empty");
        }

        if (Objects.isNull(request.getRole()) || (Objects.isNull(request.getEmail().trim().isEmpty()))) {
            response.getApiResponse().setResponseMessage("Employee role cannot be empty");
        }
          return response;
    }

}
