package com.company;

public class Employee {

    private final String fio;
    private int department;
    private int salary;
    private int id;
    private static int counter = 1;

    public Employee(String fio, int department, int salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        id = counter;
        counter++;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFio() {
        return fio;
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
        return "FIO: " + fio + "\n"
                + "Department: " + department + "\n"
                + "Salary: " + salary + "\n"
                + "ID: " + id;
    }


}
