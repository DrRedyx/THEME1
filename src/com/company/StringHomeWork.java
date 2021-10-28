package com.company;

public class StringHomeWork {
    public static void main (String[] args){
        //Task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Task 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //Task 3
        fullName = fullName.replace(" ", ";");
        System.out.println(fullName);

        //Task 4
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);

        //Task 5
        fullName = fullName.trim();
        int firstSpace = fullName.indexOf(" ");
        int secondSpace = fullName.indexOf(" ", firstSpace + 1);
        firstName = fullName.substring(firstSpace + 1, secondSpace);
        System.out.println("Name - " + firstName);
        lastName = fullName.substring(0, firstSpace);
        System.out.println("Surname - " + lastName);
        middleName = fullName.substring(secondSpace + 1);
        System.out.println("Second name - " + middleName);

        //Task 6
        fullName = fullName.toLowerCase();
        System.out.println(fullName);
        char[] fName = fullName.toCharArray();
        for (int i = 0; i < fName.length; i++) {
            if (i == 0) {
                fName[i] = Character.toUpperCase(fName[i]);
            } else if (Character.isWhitespace(fName[i])) {
                fName[i + 1] = Character.toUpperCase(fName[i+1]);
            }
        }
        System.out.println(fName);

        //Task 7
        String first = "135";
        String second = "246";
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < first.length() + second.length(); i++) {
            if (i == first.length()) {
                break;
            }
            str.append(first.charAt(i));
            str.append(second.charAt(i));
        }
        String st = str.toString();
        System.out.println(str);


        //Task 8
        String stroka = "aabccddefgghiijjkk";
        char[] ch = stroka.toCharArray();
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < ch.length-1; i++) {
            if (ch[i] == ch[i+1]) {
                newStr.append(ch[i]);
            }
        }
        stroka = newStr.toString();
        System.out.println(stroka);

    }
}
