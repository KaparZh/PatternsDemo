package com.kaparzh.creational.builder;

public class BuildEmployeeRunner {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new BankEmployeeBuilder());
        Employee employee = director.buildEmployee();
        System.out.println(employee);
    }
}
