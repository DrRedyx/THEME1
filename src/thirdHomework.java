public class ThirdHomework {
    public static void main(String[] args){
        //Task 1
        int number = 0;
        while(number < 10){
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = number; i >= 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        //Task 2
        int friday = 5;
        int daysOfWeek = 7;
        for (int i = friday; i <= 31; i+=7) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
        //Task 3
        int year = 2021;
        int previousYear = 2021-200;
        int futureYear = 2021+100;
        for (int i = previousYear; i <= futureYear; i+=79){
            if (i % 79 == 0){
                System.out.println(i);
            }
        }
        //Task 4, есть и другой вариант где мы выводим число только после проверки а не сразу
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + ":");
            if (i % 3 == 0){
                System.out.print(" ping");
            }
            if (i % 5 == 0) {
                System.out.print(" pong");
            }
            System.out.println();
        }
        //Task 5
        int firstFib = 0;
        int secondFib = 1;
        for (int i = 0; i <= 10; i++) {
            System.out.print(firstFib + " ");
            int nextFib = firstFib + secondFib;
            secondFib = firstFib;
            firstFib = nextFib;
        }
    }
}
