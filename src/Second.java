import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        //Task 1 && Task 2
        Scanner console = new Scanner(System.in);
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложение для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложение для Android по ссылке");
            }
        }

        //Task 3
        int year = console.nextInt();
        if (year % 100 == 0 || year % 4 != 0) {
            if (year % 400 == 0) {
                System.out.println(year + " год является високосным");

            } else {
                System.out.println(year + " год не является високосным");
            }
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        }

        //Task 4
        int deliveryDistance = console.nextInt();
        int days = 0;
        if (deliveryDistance <= 20) {
            days++;
            System.out.println("Delivery time: " + days);
        }
        days++;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days++;
            System.out.println("Delivery time: " + days);
        }
        days++;
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days++;
            System.out.println(("Delivery time: " + days));
        }

        //Task 5
        int monthNumber = console.nextInt();
        switch (monthNumber) {
            case 12:
            case 1:
            case 2: {
                System.out.println("Winter");
                break;
            }
            case 3:
            case 4:
            case 5: {
                System.out.println("Spring");
                break;
            }
            case 6:
            case 7:
            case 8: {
                System.out.println("Summer");
                break;
            }
            case 9:
            case 10:
            case 11: {
                System.out.println("Autumn");
                break;
            }
            default: {
                System.out.println("This month does not exist");
            }
        }

        //Task 6
        double limit = 0;
        int age = console.nextInt();
        int salary = console.nextInt();
        if (age < 23) {
            limit = salary * 2;
        } else {
            limit = salary * 3;
        }
        if (salary >= 50000 && salary < 80000) {
            limit *= 1.2;
        } else if (salary >= 80000) {
            limit *= 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом: " + limit);

        //Task 7 age and salary из задачи 6
        int maxMonthPay = salary / 2;
        double wantedSum = 330000;
        double stavka = wantedSum / 10;
        if (age < 23 && salary > 80000) {
            stavka = stavka + (wantedSum / 100) - (wantedSum / 100 * 0.7);
        } else if ((age > 23 && age < 30) && salary > 80000) {
            stavka = stavka + (wantedSum / 100 * 0.5) - (wantedSum / 100 * 0.7);
        } else if (age < 23) {
            stavka = stavka + (wantedSum / 100);
        } else if ((age > 23 && age < 30)) {
            stavka = stavka + (wantedSum / 100 * 0.5);
        }
        double kredit = wantedSum + stavka;
        if (maxMonthPay > kredit / 12) {
            System.out.println("Максимальный платёж при ЗП " + salary + " равен " + maxMonthPay + ". Платёж по кредиту " + kredit + " рублей. В кредите одобрено");
        } else {
            System.out.println("В кредите отказано.");
        }
    }
}
