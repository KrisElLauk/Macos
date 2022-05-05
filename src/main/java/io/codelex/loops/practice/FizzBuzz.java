package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int number1 = input.nextInt();
        System.out.println("Your chosen length of text is: " + number1);

        for (int i = 1; i <= number1; i++) {
            System.out.print(" ");

            if (i % 20 == 1) {
                System.out.println();
            }

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.print("Fizz");
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
}
