package com.kaparzh.creational.builder2v;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder("Ivan", "Ivanov", "Security")
                .buildGender("Male")
                .build();

        Employee employee2 = new Employee.EmployeeBuilder("Sergei", "Sergeev", "Finance")
                .buildGender("Male")
                .buildPhoneNumber("34234324234")
                .build();

        System.out.println(employee);
        System.out.println(employee2);
    }
}
