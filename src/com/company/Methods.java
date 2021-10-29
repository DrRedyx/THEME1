package com.company;
import java.util.Random;

public class Methods {

   //Task 1
   public static void leapYear(int year) {
      if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0){
         System.out.println("Another year");
      } else {
         System.out.println("Leap year");
      }
   }

   //Task 2
   public static void installProgram (int clientDeviceYear, int clientOS) {
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
   }

   //Task 3
   public static void deliveryTime(int distance) {
      int days = 0;
      while (distance > 0){
         days++;
         distance = distance - 40;
      }
      System.out.println("You will waiting " + days + " days.");
   }

   // Task 4
   public static void doubles (String stroka) {
      char[] ch = stroka.toCharArray();
      for (int i = 0; i < ch.length-1; i++) {
         if (ch[i] == ch[i + 1]) {
            System.out.println(ch[i]);
            break;
         }
      }
   }


   //Task 5
   public static void reverse (int[] array) {
      for (int i = 0; i < array.length / 2; i++) {
         int temp = array[array.length - i - 1];
         array[array.length - i - 1] = array[i];
         array[i] = temp;
      }
   }
   public static void printArray (int[] array) {
      for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + " ");
      }
   }

   //Task 6

   public static double[] generateRandomArray() {
      Random random = new Random();
      double[] arr = new double[30];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = random.nextInt(100_000) + 100_000;
      }
      return arr;
   }

   public static double averageValue () {
      int average = 0;
      double[] array = generateRandomArray();
      for (int i = 0; i < array.length; i++) {
         average += array[i];
      }
      average = average / array.length;
      return average;
   }



   public static void main (String[] args) {
      //Task 1
      int year = 2020;
      leapYear(year);

      //Task 2
      int clientOS = 1;
      int clientDeviceYear = 2021;
      installProgram(clientDeviceYear, clientOS);

      //Task 3
      int distance = 161;
      deliveryTime(distance);

      //Task 4
      String str = "aabccddefgghiijjkk";
      doubles(str);

      //Task 5
      int[] array = new int[] {4, 3, 2, 5, 7};
      printArray(array);
      reverse(array);
      System.out.println();
      printArray(array);
      System.out.println();

      //Task 6
      double average = averageValue();
      System.out.println(average);
   }
}
