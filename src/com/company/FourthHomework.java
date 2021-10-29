package com.company;
import java.util.Random;
import java.util.Arrays;

public class FourthHomework {

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main (String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        //Task 1
        int amount = 0;
        for (int i : arr) {
            amount += i;
        }
        System.out.println(amount);

        //Task 2
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.printf("Максимальная сумма: %d, минимальная сумма: %d \n", max, min);

        //Task 3
        int averageValue = amount/arr.length;
        System.out.println("Average value for month: " + averageValue);

        //Task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        //Task 5
        int [][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j || i + j + 1 == matrix.length) {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Task 6
        int [] array = {5, 4, 3, 2, 1};
        int [] arrayCopy = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[array.length  - 1 - i];
        }
        System.out.println(Arrays.toString(arrayCopy));

        //Task 7
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));

        //Task 8
        int [] mass = new int[] {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int first = 0;
        int second =0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] + mass[j] == -2) {
                    first = mass[i];
                    second = mass[j];
                }
            }
            if (first + second == -2) {
                break;
            }
        }
        System.out.println(first + " " + second);

        //Task 9
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (mass[i] + mass[j] == -2) {
                    System.out.println(mass[i] + " " + mass[j]);
                }
            }
        }
    }
}
