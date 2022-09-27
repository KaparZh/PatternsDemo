package com.kaparzh.behavioral.iterator;

public class DepartmentRunner {

    public static void main(String[] args) {
        String[] employeesName = {"Zaycev", "Bodrov", "Petrov"};
        Department department = new Department("IT", employeesName);

        Iterator iterator = department.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
