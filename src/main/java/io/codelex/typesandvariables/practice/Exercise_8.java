package io.codelex.typesandvariables.practice;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercise_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of minutes:");
        long minutes = input.nextInt();

        BigDecimal days = new BigDecimal(minutes / 1440.00);
        BigDecimal years = new BigDecimal(minutes / 525600.00);

        System.out.println(minutes + " minutes are:\n" + days + " days.\n" + years + " years.");
    }
}
