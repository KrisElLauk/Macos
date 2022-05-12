package io.codelex.enums.practice.Exercise2;

import java.util.Scanner;

public class App {

    private static int playerWonCounter = 0;
    private static int aiWonCounter = 0;

    public static void logic() {
        Scanner input = new Scanner(System.in);
        System.out.println("Let us begin...");
        boolean playAgain = true;
        int counter = 0;
        do {
            System.out.print("Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            String chosen = input.next();
            if (chosen.equals("s") || chosen.equals("p") || chosen.equals("t")) {
                System.out.println(results(chosen));
            } else if (chosen.equals("q")) {
                playAgain = false;
            } else {
                System.out.println("Wrong input! (note, you can only choose between s, p, t, q)");
            }
            counter++;
        } while (playAgain);
        System.out.println();
        System.out.println("Number of trials: " + counter);
        System.out.println("I won " + aiWonCounter + "(" + percentage(counter, aiWonCounter) + "%). You won " + playerWonCounter + "(" + percentage(counter, playerWonCounter) + "%).");
        System.out.println("Bye!");
    }

    private static float percentage(int counter, int gamesWon) {
        return ((float) gamesWon * 100 / counter);
    }

    private static String results(String decision) {
        ScissorPaperStone aiChoice = ScissorPaperStone.ai();
        ScissorPaperStone playerChoice = null;
        if (decision.equals("s")) {
            playerChoice = ScissorPaperStone.Scissors;
        } else if (decision.equals("p")) {
            playerChoice = ScissorPaperStone.Paper;
        } else if (decision.equals("t")) {
            playerChoice = ScissorPaperStone.Stone;
        }

        System.out.println("My turn: " + aiChoice);
        if ((playerChoice == ScissorPaperStone.Paper && aiChoice == ScissorPaperStone.Stone) ||
                (playerChoice == ScissorPaperStone.Stone && aiChoice == ScissorPaperStone.Scissors) ||
                (playerChoice == ScissorPaperStone.Scissors && aiChoice == ScissorPaperStone.Paper)) {
            playerWonCounter++;
            return "You won!";
        } else if ((playerChoice == ScissorPaperStone.Paper && aiChoice == ScissorPaperStone.Scissors) ||
                (playerChoice == ScissorPaperStone.Stone && aiChoice == ScissorPaperStone.Paper) ||
                (playerChoice == ScissorPaperStone.Scissors && aiChoice == ScissorPaperStone.Stone)) {
            aiWonCounter++;
            return "I won!";
        } else {
            return "Tie!";
        }
    }
}
