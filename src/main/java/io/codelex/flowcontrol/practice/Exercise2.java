package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class Exercise2 {

    //TODO: Write a Java program to to find the largest of three numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("1st number " + num1 + " is the largest number.");
        } else if (num2 > num3) {
            System.out.println("2nd number " + num2 + " is the largest number.");
        } else {
            System.out.println("3rd number " + num3 + " is the largest number.");
        }
        
        /*
        todo - expected output:
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
         */
    }
}
