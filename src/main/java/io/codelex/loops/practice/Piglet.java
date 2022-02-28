package io.codelex.loops.practice;

import java.util.Scanner;

public class Piglet {

    public static void main(String[] args) {

        int totalPointsRecieved = 0;
        int pointsRecieved = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Piglet! Roll a dice!");

        while (true) {
            int rollDice = (int) (Math.floor(Math.random() * 6) + 1);

            if (rollDice == 1) {
                System.out.println("You rolled a " + rollDice + ".");
                System.out.println("You got 0 points.");
                pointsRecieved = 0;
                System.exit(0);
            } else {
                System.out.println("You rolled a " + rollDice + ".");
                totalPointsRecieved += pointsRecieved + rollDice;
                System.out.println("Would you like to roll again? y/n");
                String rollAgain = input.nextLine();
                if (rollAgain.equals("n")) {
                    System.out.println("You got " + totalPointsRecieved + " points.");
                    System.exit(0);
                } else if (rollAgain.equals("y")) {
                    totalPointsRecieved += pointsRecieved;
                }
            }
        }
    }
}