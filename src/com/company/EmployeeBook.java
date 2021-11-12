package com.company;

public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int length) {
        employees = new Employee[length];
    }


    public void addEmployee(String fullName, int department, int salary) {
        Employee employee = new Employee(fullName, department, salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
        throw new RuntimeException("Штат сотрудников заполнен");
    }

    public void deleteEmployee (int id, String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id || employees[i].getFullName().equals(fullName)) {
                employees[i] = null;
                System.out.println("Сотрудник уволен");
                return;
            }
            System.out.println("Сотрудника не существует");
        }
    }

    public void printInformation() {
        System.out.println("Список сотрудников со всей информацией:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(i+1 + ")" + employees[i]);
        }
    }

    public int findTotalSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public void findMinSalary() {
        int min = employees[0].getSalary();
        String fullName = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                fullName = employees[i].getFullName();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + fullName + ". Salary: " + min);
    }

    public void findMaxSalary() {
        int max = employees[0].getSalary();
        String fullName = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                fullName = employees[i].getFullName();
            }
        }
        System.out.println("Сотрудник с самой высокой зарплатой: " + fullName + ". Salary: " + max);
    }

    public double findAverageSalary() {
        double sum = findTotalSalary();
        return sum/employees.length;
    }

    public void printAllEmployeesFullNames() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(i + 1 + ")" + employees[i].getFullName());
        }
    }

    public void changeSalary(int percent) {
        for (int i = 0; i < employees.length; i++) {
            int newSalary = employees[i].getSalary() * (1 + percent/100);
            employees[i].setSalary(newSalary);
        }
    }
    public void findDepartmentMinSalary(int department) {
        int min = employees[0].getSalary();
        String fio = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department && employees[i].getSalary() < min){
                    min = employees[i].getSalary();
                    fio = employees[i].getFullName();
            }
        }
        System.out.println("Сотрудник в отделе " + department  + " c минимальной зарплатой: " + fio + ". Salary: " + min);
    }

    public void findDepartmentMaxSalary(int department) {
        int max = employees[0].getSalary();
        String fio = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department && employees[i].getSalary() > max) {
                    max = employees[i].getSalary();
                    fio = employees[i].getFullName();
            }
        }
        System.out.println("Сотрудник в отделе " + department  + " c максимальной зарплатой: " + fio + ". Salary: " + max);
    }

    public int findDepartmentTotalSalary(int department) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }


    public double findDepartmentAverageSalary(int department) {
        double sum = 0;
        double count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
                count++;
            }
        }
        return sum/count;
    }

    public void changeSalaryDepartment(int percent, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                int newSalary = employees[i].getSalary() * (1 + percent/100);
                employees[i].setSalary(newSalary);
            }
        }
    }

    public void printAllDepartmentInfo(int department) {
        System.out.println("Сотрудники отдела " + department);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].getId() + ")" + employees[i].getFullName() + " " + employees[i].getSalary());
            }
        }
    }

    public void findMaxSalaryFromNumber(int number) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > number) {
                System.out.println(employees[i]);
            }
        }
    }

    public void findMinSalaryFromNumber(int number) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < number) {
                System.out.println(employees[i]);
            }
        }
    }

    public void changeEmployee(String fullName, int salary, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(fullName)) {
                employees[i].setSalary(salary);
                employees[i].setDepartment(department);
                System.out.println(employees[i]);
            }
        }
    }

    public void printEmployeesFromDepartment() {
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        StringBuilder thirst = new StringBuilder();
        for (int i = 0; i < employees.length; i++) {
            switch (employees[i].getDepartment()) {
                case 1:
                    first.append(employees[i].getFullName() + "\n");
                case 2:
                    second.append(employees[i].getFullName() + "\n");
                case 3:
                    thirst.append(employees[i].getFullName() + "\n");
            }
        }
        System.out.println("First department employees fullNames: " + first.toString());
        System.out.println("Second department employees fullNames: " + second.toString());
        System.out.println("Thirst department employees fullNames: " + thirst.toString());
    }

}
