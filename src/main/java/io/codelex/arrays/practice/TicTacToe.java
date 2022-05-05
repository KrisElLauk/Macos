package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean xTurn = true;
        boolean gameEnded = false;

        initBoard();
        displayBoard();

        while (!gameEnded) {
            drawBoard(board);
            if (xTurn) {
                System.out.print("'X', choose your location (row, column): ");
            } else {
                System.out.print("'O', choose your location (row, column): ");
            }

            char turn = ' ';
            if (xTurn) {
                turn = 'X';
            } else {
                turn = 'O';
            }

            int row = 0;
            int col = 0;

            while (true) {
                row = keyboard.nextInt();
                col = keyboard.nextInt();

                if (row < 0 || col < 0 || row > 2 || col > 2) {
                    System.out.println("Unknown location. Note: use numbers 0-2.");
                } else if (board[row][col] != ' ') {
                    System.out.println("This location is already occupied. Choose a different location.");
                } else {
                    break;
                }
            }

            board[row][col] = turn;

            if (playerHasWon(board) == 'X') {
                System.out.println("X won!");
                gameEnded = true;
            } else if (playerHasWon(board) == 'O') {
                System.out.println("O won!");
                gameEnded = true;
            } else {
                if (boardIsFull(board)) {
                    System.out.println("The game is a tie.");
                    gameEnded = true;
                } else {
                    xTurn = !xTurn;
                }
            }
        }
        drawBoard(board);

    }

    public static void drawBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static char playerHasWon(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return board[i][0];
            }
        }
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
                return board[0][j];
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return board[0][0];
        }
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != ' ') {
            return board[2][0];
        }
        return ' ';
    }

    public static boolean boardIsFull(char[][] board) {
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                if (board[k][l] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}