package com.example.employeepayroll.employee_payroll.repository;

import com.example.employeepayroll.employee_payroll.DTO.EmployeeRequestDTO;
import com.example.employeepayroll.employee_payroll.DTO.EmployeeResponseDTO;
import com.example.employeepayroll.entities.HostHeaderResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.Objects;

@Repository
public class EmployeeRepositoryImpl implements IEmployeeRepository {
    Logger logger = LoggerFactory.getLogger(EmployeeRepositoryImpl.class);

    @Override
    public EmployeeResponseDTO verifyEmployeeDetails(EmployeeRequestDTO request) {
        EmployeeResponseDTO responseDTO = new EmployeeResponseDTO();
        HostHeaderResponse response = new HostHeaderResponse();
        if (Objects.isNull(request.getFirstName()) || (Objects.isNull(request.getFirstName().trim().isEmpty()))) {
            response.setResponseMessage("Employee first name cannot be empty");
            return null;
          }
          if (Objects.isNull(request.getLastName()) || (Objects.isNull(request.getFirstName().trim().isEmpty()))) {
              response.setResponseMessage("Employee last name cannot be empty");
              return null;
          }
          if (Objects.isNull(request.getEmail()) || (Objects.isNull(request.getEmail().trim().isEmpty()))) {
              return null;
          }

          return responseDTO;
    }

}
