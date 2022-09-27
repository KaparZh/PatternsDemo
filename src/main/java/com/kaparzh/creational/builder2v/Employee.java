package com.kaparzh.creational.builder2v;

public class Employee {

    private final String name;
    private final String lastName;
    private final String middleName;
    private final String department;
    private final String phoneNumber;
    private final String gender;
    private final boolean isMarried;

    private Employee(EmployeeBuilder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.department = builder.department;
        this.phoneNumber = builder.phoneNumber;
        this.gender = builder.gender;
        this.isMarried = builder.isMarried;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDepartment() {
        return department;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public boolean isMarried() {
        return isMarried;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }

    public static class EmployeeBuilder {

        private final String name;
        private final String lastName;
        private final String department;
        private String middleName;
        private String phoneNumber;
        private String gender;
        private boolean isMarried;

        public EmployeeBuilder(String name, String lastName, String department) {
            this.name = name;
            this.lastName = lastName;
            this.department = department;
        }

        public EmployeeBuilder buildMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public EmployeeBuilder buildPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public EmployeeBuilder buildGender(String gender) {
            this.gender = gender;
            return this;
        }

        public EmployeeBuilder buildMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
