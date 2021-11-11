package com.company;

public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int length) {
        employees = new Employee[length];
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
        throw new RuntimeException("Штат сотрудников заполнен");
    }

    public void deleteEmployee (int id, String fio) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id || employees[i].getFio().equals(fio)) {
                employees[i] = null;
                System.out.println("Сотрудник уволен");
            } else {
                System.out.println("Сотрудника не существует");
            }
        }
    }

    public void printInformation() {
        System.out.println("Список сотрудников со всей информацией:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(i+1 + ")" + employees[i]);
        }
    }

    public int findAllSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public void findMinSalary() {
        int min = employees[1].getSalary();
        String fio = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                fio = employees[i].getFio();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + fio + ". Salary: " + min);
    }

    public void findMaxSalary() {
        int max = employees[1].getSalary();
        String fio = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                fio = employees[i].getFio();
            }
        }
        System.out.println("Сотрудник с самой высокой зарплатой: " + fio + ". Salary: " + max);
    }

    public void findAverageSalary() {
        int sum = findAllSalary();
        int average = sum/employees.length;
        System.out.println("Average salary: " + average);
    }

    public void printAllFIO() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(i + 1 + ")" + employees[i].getFio());
        }
    }

    public void changeSalary(int percent) {
        for (int i = 0; i < employees.length; i++) {
            int newSalary = employees[i].getSalary() + (employees[i].getSalary()/100 * percent);
            employees[i].setSalary(newSalary);
            newSalary = 0;
        }
    }
    public void findDepartmentMinSalary(int department) {
        int min = employees[1].getSalary();
        String fio = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department){
                if (employees[i].getSalary() < min) {
                    min = employees[i].getSalary();
                    fio = employees[i].getFio();
                }
            }
        }
        System.out.println("Сотрудник в отделе " + department  + " c минимальной зарплатой: " + fio + ". Salary: " + min);
    }

    public void findDepartmentMaxSalary(int department) {
        int max = employees[1].getSalary();
        String fio = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() > max) {
                    max = employees[i].getSalary();
                    fio = employees[i].getFio();
                }
            }
        }
        System.out.println("Сотрудник в отделе " + department  + " c максимальной зарплатой: " + fio + ". Salary: " + max);
    }

    public int findDepartmentSalary(int department) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }


    public void findDepartmentAverageSalary(int department) {
        int sum = findDepartmentSalary(department);
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                count++;
            }
        }
        int average = sum/count;
        System.out.println("Average department salary: " + average);
    }

    public void changeSalaryDepartment(int percent, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                int newSalary = employees[i].getSalary() + (employees[i].getSalary() / 100 * percent);
                employees[i].setSalary(newSalary);
                newSalary = 0;
            }
        }
    }

    public void printAllDepartmentInfo(int department) {
        System.out.println("Сотрудники отдела " + department);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].getId() + ")" + employees[i].getFio() + " " + employees[i].getSalary());
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

    public void changeEmployee(String fio, int salary, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFio().equals(fio)) {
                employees[i].setSalary(salary);
                employees[i].setDepartment(department);
                System.out.println(employees[i]);
            }
        }
    }

}
