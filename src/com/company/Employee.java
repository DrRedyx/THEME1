package com.company;

public class Employee {

    private final String fullName;
    private int department;
    private int salary;
    private final int id;
    private static int counter = 0;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return "FullName: " + fullName + "\n"
                + "Department: " + department + "\n"
                + "Salary: " + salary + "\n"
                + "ID: " + id;
    }


}
