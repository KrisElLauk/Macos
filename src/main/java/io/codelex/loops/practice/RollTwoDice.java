package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your desired number:");

        int num = input.nextInt();
        if (num == 1) {
            System.out.println("Sorry, you can only choose a number between 2 - 12!");
            System.exit(0);
        }
        System.out.println("Desired number: " + num);


        while (true) {
            Random roll = new Random();
            int rollDice = roll.nextInt(6) + 1;
            int rollDice2 = roll.nextInt(6) + 1;
            int sum = rollDice + rollDice2;

            if (sum != num) {
                System.out.println(rollDice + " and " + rollDice2 + " = " + sum);
            } else {
                System.out.println(rollDice + " and " + rollDice2 + " = " + sum);
                break;
            }

        }

    }
}
