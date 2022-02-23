package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Write a number:");

        int a = input.nextInt();
        System.out.println("Write number 2:");

        int b = input.nextInt();
        System.out.println("Write number 3 to sum all:");

        int c = input.nextInt();

        System.out.println("Sum of all numbers is: " + (a + b + c));

    }
}
