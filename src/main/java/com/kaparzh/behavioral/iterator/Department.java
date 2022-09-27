package com.kaparzh.behavioral.iterator;

public class Department implements Collection {

    private String name;
    private String[] employeesName;

    public Department(String name, String[] employeesName) {
        this.name = name;
        this.employeesName = employeesName;
    }

    @Override
    public Iterator getIterator() {
        return new EmployeesNameIterator();
    }

    private class EmployeesNameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < employeesName.length;
        }

        @Override
        public Object next() {
            return employeesName[index++];
        }
    }
}
