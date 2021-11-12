package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
        EmployeeBook employeeBook = new EmployeeBook(10);
        employeeBook.addEmployee("Абрамов Иван Ашотович", 3, 45000);
        employeeBook.addEmployee("Нигаматуллин Ильяс Ильфатович", 1, 90000);
        employeeBook.addEmployee("Нигаматуллин Ильдар Ильфатович", 2, 90000);
        employeeBook.addEmployee("Кочкин Роман Дмитриевич", 3, 90000);
        employeeBook.addEmployee("Кочнев Роман Сергеевич", 1, 90000);
        employeeBook.addEmployee("Патрикеев Алексей Дмитриевич", 2, 90000);
        employeeBook.addEmployee("Желавский Алексей Юрьевич", 3, 90000);
        employeeBook.addEmployee("Валеев Руслан Эдуардович", 1, 90000);
        employeeBook.addEmployee("Губин Андрей Андреевич", 2, 30000);
        employeeBook.addEmployee("Камалов Айбек Улугбекович", 3, 30000);
        employeeBook.changeEmployee("Кочнев Роман Сергеевич", 45000, 3);
        double sum = employeeBook.findAverageSalary();
        System.out.println(sum);
        employeeBook.printEmployeesFromDepartment();



    }
}
