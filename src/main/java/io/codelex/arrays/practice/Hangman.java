package io.codelex.arrays.practice;

import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = "grapefruit";
        int tryCount = 5;
        String missedLetters = "";
        String guessedLetters = "";

        int tries = 0;
        while (tries <= tryCount) {
            printOutTurn(name, guessedLetters, missedLetters);
            String guess = input.nextLine();
            if (name.contains(guess)) {
                if (!guessedLetters.contains(guess)) {
                    guessedLetters += guess;
                }
            } else {
                missedLetters += guess;
                tries++;
            }
            if (hasWon(name, guessedLetters)) {
                System.out.println("You got it!");
                System.out.println(name);
                break;
            }
        }

        if (!hasWon(name, guessedLetters)) {
            System.out.println("You lost!");
        }


    }

    private static void printOutWord(String name, String guessedLetters) {
        for (char guess : name.toCharArray()) {
            if (guessedLetters.contains(String.valueOf(guess))) {
                System.out.println(guess);
            } else {
                System.out.println('_');
            }
        }
        System.out.println();
    }

    private static boolean hasWon(String name, String guessedLetters) {
        boolean won = true;
        for (char a : name.toCharArray()) {
            if (!guessedLetters.contains(String.valueOf(a))) {
                won = false;
                break;
            }
        }
        return won;
    }

    private static void printOutTurn(String name, String guessedLetters, String missedLetters) {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Word: ");
        printOutWord(name, guessedLetters);
        System.out.println("Misses: " + missedLetters);
        System.out.println("Guess: ");
    }
}
