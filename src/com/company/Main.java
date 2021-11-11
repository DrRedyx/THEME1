package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
        EmployeeBook employeeBook = new EmployeeBook(10);
        Employee employee1 = new Employee("Абрамов Иван Ашотович", 3, 45000);
        Employee employee2 = new Employee("Нигаматуллин Ильяс Ильфатович", 1, 90000);
        Employee employee3 = new Employee("Нигаматуллин Ильдар Ильфатович", 2, 90000);
        Employee employee4 = new Employee("Кочкин Роман Дмитриевич", 3, 90000);
        Employee employee5 = new Employee("Кочнев Роман Сергеевич", 1, 90000);
        Employee employee6 = new Employee("Патрикеев Алексей Дмитриевич", 2, 90000);
        Employee employee7 = new Employee("Желавский Алексей Юрьевич", 3, 90000);
        Employee employee8 = new Employee("Валеев Руслан Эдуардович", 1, 90000);
        Employee employee9 = new Employee("Губин Андрей Андреевич", 2, 30000);
        Employee employee10 = new Employee("Камалов Айбек Улугбекович", 3, 30000);
        employeeBook.addEmployee(employee1);
        employeeBook.addEmployee(employee2);
        employeeBook.addEmployee(employee3);
        employeeBook.addEmployee(employee4);
        employeeBook.addEmployee(employee5);
        employeeBook.addEmployee(employee6);
        employeeBook.addEmployee(employee7);
        employeeBook.addEmployee(employee8);
        employeeBook.addEmployee(employee9);
        employeeBook.addEmployee(employee10);
        employeeBook.changeEmployee("N.A.I", 45000, 3);



    }
}
