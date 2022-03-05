package com.example.employeepayroll.employee_payroll.domain;

public enum Employee {
    GT("GRADUATE TRAINEE", "12,675", "12,675,000,000", "NGN"),
    ET("EXECUTIVE TRAINEE", "15,271", "15,271,000", "NGN"),
    JE("JUNIOR TECHNICAL EXECUTIVE", "19,979", "19,979,000", "NGN"),
    SE("SENIOR TECHNICAL EXECUTIVE", "29,975", "29,975,000", "USD"),
    AM("ASSISTANT MANAGER", "31,975", "31,975,000", "USD"),
    MG("MANAGER", "39,975", "39,975,000", "USD"),
    DR("DIRECTOR", "41,975", "41,975,000", "USD"),
    CO("CEO", "58,975", "58,975,000", "USD");


    private String role;
    private String task;
    private String grossSalary;
    private String salaryCurrency;

    Employee(String role, String task, String grossSalary, String salaryCurrency) {
        {
            this.role = role;
            this.task = task;
            this.grossSalary = grossSalary;
            this.salaryCurrency = salaryCurrency;
        }
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(String grossSalary) {
        this.grossSalary = grossSalary;
    }

    public String getSalaryCurrency() {
        return salaryCurrency;
    }

    public void setSalaryCurrency(String salaryCurrency) {
        this.salaryCurrency = salaryCurrency;
    }
}
