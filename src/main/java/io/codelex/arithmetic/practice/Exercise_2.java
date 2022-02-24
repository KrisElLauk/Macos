package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise_2 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter your number");
            int nr1 = input.nextInt();

            if (nr1 % 2 == 0) {
                System.out.println("Even number\nbye!");
            } else {
                System.out.println("Odd number\nbye!");
            }
    }

}
