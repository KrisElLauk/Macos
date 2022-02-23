package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Write a sentence.");

        int count = 0;
        String a = input.nextLine();
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i)))
                count++;
        }
        System.out.println("Number of uppercase characters of your given string is: " + count);
    }
}
