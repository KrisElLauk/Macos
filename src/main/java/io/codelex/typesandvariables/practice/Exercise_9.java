package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Test data:");
        System.out.println("Input distance in meters:");
        float meters = input.nextInt();

        System.out.println("Input time spent:");
        System.out.println("Hours:");
        float hours = input.nextInt();

        System.out.println("Minutes:");
        float minutes = input.nextInt();

        System.out.println("Seconds:");
        float seconds = input.nextInt();

        float secondsSpent = ((hours * 60) * 60) + (minutes * 60) + seconds;

        float metersPerSecond = meters / secondsSpent;
        double kilometersPerHour = metersPerSecond * 3.6;
        double milesPerHour = kilometersPerHour / 1.609;

        System.out.println("Your speed in meters per second is: " + metersPerSecond + "\nYour speed in kilometers in hour is: " + kilometersPerHour + "\nYour speed in miles per hour is: " + milesPerHour);

    }
}
