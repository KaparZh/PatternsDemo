package com.kaparzh.creational.builder;

public class Director {
    EmployeeBuilder builder;

    Employee buildEmployee() {
        return builder.createEmployee()
                .buildName()
                .buildLastName()
                .buildPhoneNumber()
                .buildSalary()
                .getEmployee();
    }

    public void setBuilder(EmployeeBuilder builder) {
        this.builder = builder;
    }
}
