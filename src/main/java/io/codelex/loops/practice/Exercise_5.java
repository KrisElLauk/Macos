package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word:");
        String str1 = input.nextLine();

        System.out.println("Enter second word:");
        String str2 = input.nextLine();

        String dots = "";
        String sentence = str1 + "" + str2;
        int length = sentence.length();
        int dotCounter = 0;

        if (length <= 30) {
            dotCounter = 30 - length;
            for (int i = 1; i <= dotCounter; i++) {
                dots += ".";
            }
            System.out.println(str1 + dots + str2);
        }
    }
}
