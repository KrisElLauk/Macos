package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Exercise_2 {

    public static void main(String[] args) {

        System.out.println("Enter your servers launch date: ");
        LocalDate launchDate = date();

        System.out.println("Enter the year you wish to see updates for: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println("Enter the month (in letters): ");
        input.nextLine();
        String currentMonth = input.nextLine().toUpperCase();

        updateDate(launchDate, year, currentMonth);

    }

    public static LocalDate date() {
        Scanner date = new Scanner(System.in);
        System.out.println("Enter day: ");
        int day = date.nextInt();
        System.out.println("Enter month: ");
        int month = date.nextInt();
        System.out.println("Enter year: ");
        int year = date.nextInt();

        return LocalDate.of(year, month, day);
    }

    public static void updateDate(LocalDate launchDate, int year, String month) {
        LocalDate currentMonth = LocalDate.of(year, Month.valueOf(month), 1);
        LocalDate index;
        for (index = launchDate; index.isBefore(currentMonth); ) {
            index = index.plusDays(14);
        }

        System.out.println("Your first update is planned for: " + year + " " + month + " " + index + "\nYour next update is planed at: " + index.plusDays(14));
    }
}
