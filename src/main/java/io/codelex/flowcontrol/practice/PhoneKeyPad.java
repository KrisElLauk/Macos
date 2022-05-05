package io.codelex.flowcontrol.practice;

import java.util.Locale;
import java.util.Scanner;

public class PhoneKeyPad {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your letters here: ");

        String letters = input.nextLine().toLowerCase(Locale.ROOT);
        int number = 0;

        for (int i = 0; i < letters.length(); i++) {
            switch (letters.charAt(i)) {
                case 'a', 'b', 'c' -> number = 2;
                case 'd', 'e', 'f' -> number = 3;
                case 'g', 'h', 'i' -> number = 4;
                case 'j', 'k', 'l' -> number = 5;
                case 'm', 'n', 'o' -> number = 6;
                case 'p', 'q', 'r', 's' -> number = 7;
                case 't', 'u', 'v' -> number = 8;
                case 'w', 'x', 'y', 'z' -> number = 9;
                default -> System.out.println("Unrecognized symbol");
            }
            System.out.print(number);
        }
    }
}
