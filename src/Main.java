public class Main {
    public static void main(String[] args){
        //task 1
        byte byt = 1;
        short sh = 1;
        int n = 1;
        long l = 11234413212L;
        float f = 1.0F;
        double duble = 1.0;
        char ch = 1;
        boolean bool = true;

        //task 2
        double weightFirstBoxer = 78.2;
        double weightSecondBoxer = 82.7;
        System.out.println("Средний вес спортсменов: " + (weightFirstBoxer+weightSecondBoxer)/2);
        System.out.println("Разница веса: " + (weightSecondBoxer-weightFirstBoxer));

        //task 3
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int isecream = 2 * 100;
        int eggs = 4 * 70;
        int weightProducts = bananas + milk + isecream + eggs;
        double breakfast = (double) weightProducts/1000;
        System.out.println(breakfast + " kg");

        //task 4
        int loseWeight = 7 * 1000;
        int firstDiet = 250;
        int secondDiet = 500;
        int daysFirstDiet = loseWeight/firstDiet;
        int daysSecondDiet = loseWeight / secondDiet;
        int averageDays = (daysFirstDiet + daysSecondDiet)/2;
        System.out.println("First diet: " + daysFirstDiet + " days");
        System.out.println("Second diet: " + daysSecondDiet + " days");
        System.out.println("Average days: " + averageDays);

        //task 5
        int MashaSalary = 67760;
        int DenisSalary = 83690;
        int KristinaSalary = 76230;
        int MashaPlus = MashaSalary/10;
        int DenisPlus = DenisSalary/10;
        int KristinaPlus = KristinaSalary/10;
        int MashaSalaryYearPlus = MashaPlus * 12;
        int DenisSalaryYearPlus = DenisPlus * 12;
        int KristinaSalaryYearPlus = KristinaPlus * 12;
        int MashaNowSalary = MashaSalary + MashaPlus;
        int DenisNowSalary = DenisSalary + DenisPlus;
        int KristinaNowSalary = KristinaSalary + KristinaPlus;
        System.out.println("Маша теперь получает: " + MashaNowSalary + " рублей. Годовой доход вырос на " + MashaSalaryYearPlus + " рублей.");
        System.out.println("Denis теперь получает: " + DenisNowSalary + " рублей. Годовой доход вырос на " + DenisSalaryYearPlus + " рублей.");
        System.out.println("Kristina теперь получает: " + KristinaNowSalary + " рублей. Годовой доход вырос на " + KristinaSalaryYearPlus + " рублей.");

        //task 6
        int a = 12, b = 27, c = 44, d = 15, e = 9;
        int result = -(a * (b + (c - d * e)));
        System.out.println(result);

        //task 7
        int first = 5;
        int second = 7;
        first = first + second;
        second = first-second;
        first = first-second;
        System.out.println(first);
        System.out.println(second);

        //task 8
        int number = 478;
        number = number / 10;
        int sredniyNumber = number % 10;
        System.out.println(sredniyNumber);


    }
}
