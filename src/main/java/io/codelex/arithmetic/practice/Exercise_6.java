package io.codelex.arithmetic.practice;

public class Exercise_6 {

    public static void main(String[] args) {

        int n = 110;
        for (int i = 1; i <= n; i++) {

                System.out.print(" ");

                if (i % 11 == 1) {
                    System.out.println();
                }

                if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                    System.out.print("CozaLozaWoza");
                } else if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("CozaLoza");
                } else if (i % 3 == 0 && i % 7 == 0) {
                    System.out.print("CozaWoza");
                } else if (i % 5 == 0 && i % 7 == 0) {
                    System.out.print("LozaWoza");
                } else if (i % 5 == 0) {
                    System.out.print("Loza");
                } else if (i % 3 == 0) {
                    System.out.print("Coza");
                } else if (i % 7 == 0) {
                    System.out.print("Woza");
                } else {
                    System.out.print(" " + i);
                }
            }
            System.out.println();
        }
    }



