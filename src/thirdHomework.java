public class thirdHomework {
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
        for (int i = friday; i <= 31; i++){   //Another variant (int i = friday; i <= 31; i+=7)
            if (i - friday == 0) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
                friday = friday + daysOfWeek;
            }
        }
        //Task 3
        int year = 2021;
        int previousYear = 2021-200;
        int futureYear = 2021+100;
        for (int i = 0; i <= futureYear; i+=79){
            if (i >= previousYear && i <= futureYear){
                System.out.println(i);
            }
        }
        //Task 4, есть и другой вариант где мы выводим число только после проверки а не сразу
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + ":");
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.print("ping pong");
            }
            else if (i % 5 == 0) {
                System.out.print("pong");
            }
            else if (i % 3 == 0){
                System.out.print("ping");
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
