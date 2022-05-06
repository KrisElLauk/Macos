package io.codelex.classesandobjects.practice.Exercise_3;

public class FuelGauge {

    public static double maxFuel = 70;
    private double currentFuel;

    public FuelGauge(double currentFuel) {
        if (currentFuel <= maxFuel) {
            this.currentFuel = currentFuel;
        } else {
            currentFuel = maxFuel;
        }
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public void fillingCar() {
        if (currentFuel < maxFuel) {
            this.currentFuel++;
        } else {
            System.out.println("Your cars tank is full.");
        }
    }

    public void burningFuel() {

        if (currentFuel > 0) {
            this.currentFuel--;
        } else {
            System.out.println("Your car is out of fuel.");
        }
    }

}
