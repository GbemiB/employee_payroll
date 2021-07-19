package com.example.employeepayroll.employee_payroll.DTO;

import com.example.employeepayroll.entities.HostHeaderResponse;

public class EmployeeResponseDTO {
    private HostHeaderResponse hostHeaderResponse;
    private String data;
    private String responseCode;
    private String responseMessage;

    public HostHeaderResponse getHostHeaderResponse() {
        return hostHeaderResponse;
    }

    public void setHostHeaderResponse(HostHeaderResponse hostHeaderResponse) {
        this.hostHeaderResponse = hostHeaderResponse;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
