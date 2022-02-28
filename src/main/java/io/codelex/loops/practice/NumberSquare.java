package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter min number:");
        int min = input.nextInt();

        System.out.println("Enter max number:");
        int max = input.nextInt();

        System.out.println("Your min number is: " + min);
        System.out.println("Your max number is: " + max);

        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int k = 0; k < i - min; k++) {
                System.out.print(min + k);
            }
            System.out.println();
        }
    }
}
