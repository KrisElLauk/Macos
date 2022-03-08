package io.codelex.classesandobjects.practice.Exercise_2;

import java.util.Scanner;

public class LitersPerKilometer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double startKilometers;
        double endKilometers;
        double liters;

        System.out.print("Enter kilometers during start: ");
        startKilometers = input.nextDouble();

        System.out.print("Enter kilometers when finished the trip: ");
        endKilometers = input.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = input.nextDouble();



        Car car1 = new Car(startKilometers, endKilometers, liters);
        System.out.println("Your car is consuming " + car1.calculateConsumption() + " liters per 100 kilometers.");
        if (car1.gasHog()) {
            System.out.println("Your car is a gas hog!");
        } else if (car1.economyCar()) {
            System.out.println("Your car is really economic!");
        }

        System.out.print("Enter second car kilometers during start: ");
        startKilometers = input.nextDouble();

        System.out.print("Enter second car kilometers when finished the trip: ");
        endKilometers = input.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = input.nextDouble();

        Car car2 = new Car(startKilometers, endKilometers, liters);
        System.out.println("Your car is consuming " + car2.calculateConsumption() + " liters per 100 kilometers.");
        if (car2.economyCar()) {
            System.out.println("Your car is really economic!");
        } else if (car2.gasHog()){
            System.out.println("Your car is a gas hog!");
        }
    }
}
