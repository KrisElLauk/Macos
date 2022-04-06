package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int divisor = 0;
        while (true) {
            try {
                System.out.println("Enter the numerator");
                String numeratorExit = scanner.next();
                if (numeratorExit.toLowerCase().charAt(0) == 'q') {
                    break;
                } else {
                    numerator = Integer.parseInt(numeratorExit);
                    System.out.println("Enter the divisor");
                    divisor = scanner.nextInt();
                    System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
                }
            } catch (Exception e) {
                if (e instanceof ArithmeticException) {
                    System.out.println("You can't divide by 0");
                } else {
                    System.out.println("You entered bad data.");
                    System.out.println("Please try again.");
                    scanner.next();
                }
            }
        }
    }
}
