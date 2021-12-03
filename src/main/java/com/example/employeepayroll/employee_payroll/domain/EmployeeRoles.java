package com.example.employeepayroll.employee_payroll.domain;

public enum EmployeeRoles {
    GT("GRADUATE TRAINEE"),
    ET("EXECUTIVE TRAINEE"),
    JE("JUNIOR TECHNICAL EXECUTIVE"),
    SE("SENIOR TECHNICAL EXECUTIVE"),
    AM("ASSISTANT MANAGER"),
    MG("MANAGER"),
    DR("DIRECTOR"),
    CO("CEO");


    private String role;

    EmployeeRoles(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
