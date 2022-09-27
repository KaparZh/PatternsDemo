package com.kaparzh.creational.builder;

public abstract class EmployeeBuilder {
    Employee employee;

    EmployeeBuilder createEmployee() {
        employee = new Employee();
        return this;
    }

    abstract EmployeeBuilder buildName();
    abstract EmployeeBuilder buildLastName();
    abstract EmployeeBuilder buildPhoneNumber();
    abstract EmployeeBuilder buildSalary();

    Employee getEmployee() {
        return employee;
    }
}
