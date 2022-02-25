package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms: ");
        double num1 = input.nextDouble();

        System.out.println("Enter your height centimeters: ");
        double num2 = input.nextDouble();

        double result = (num1 / num2 / num2) * 10000;

        if (result < 18.5) {
            System.out.println("Your BMI is: " + result + ". You are underweight.");
        } else if (result > 25) {
            System.out.println("Your BMI is: " + result + ". You are overweight.");
        } else {
            System.out.println("Your BMI is: " + result + ". Your weight is optimal.");
        }


    }
}
