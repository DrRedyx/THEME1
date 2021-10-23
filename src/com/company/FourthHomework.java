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
    private static final int[] arr = generateRandomArray();

    public static void main (String[] args) {
        System.out.println(Arrays.toString(arr));
        //Task 1
        int amount = 0;
        for (int i = 0; i < arr.length; i++) {
            amount += arr[i];
        }
        System.out.println(amount);

        //Task 2
        int min = 200_999;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.printf("Максимальная сумма: %d, минимальная сумма: %d \n", max, min);

        //Task 3
        int averageValue = amount/arr.length;
        System.out.println("Average value for month: " + averageValue);

        //Task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length/2; i++) {
            char temp = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));

        //Task 5
        int [][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j || i + j + 1 == matrix.length) {
                    matrix[i][j] = 1;
                }
                else {
                    matrix[i][j] = 0;
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
        Arrays.sort(mass);
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
