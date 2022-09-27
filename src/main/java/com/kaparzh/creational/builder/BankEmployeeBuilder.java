package com.kaparzh.creational.builder;

public class BankEmployeeBuilder extends EmployeeBuilder{

    @Override
    EmployeeBuilder buildName() {
        employee.setName("Ivan");
        return this;
    }

    @Override
    EmployeeBuilder buildLastName() {
        employee.setLastName("Ivanov");
        return this;
    }

    @Override
    EmployeeBuilder buildPhoneNumber() {
        employee.setPhoneNumber("84897987");
        return this;
    }

    @Override
    EmployeeBuilder buildSalary() {
        employee.setSalary(7000);
        return this;
    }
}
