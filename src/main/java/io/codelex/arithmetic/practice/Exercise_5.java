package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
        int guess = input.nextInt();

        int randomNumber = (int) Math.floor(Math.random() * 100) + 1;

        if (guess == randomNumber) {
            System.out.println("You guessed it! What are the odds?");
        } else if (guess < randomNumber) {
            System.out.println("Sorry, you are too low. I was thinking of " + randomNumber);
        } else if (guess > randomNumber) {
            System.out.println("Sorry, you are too high. I was thinking of " + randomNumber);
        }

    }
}
