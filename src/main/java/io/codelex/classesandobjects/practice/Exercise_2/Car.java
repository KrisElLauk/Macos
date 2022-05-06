package io.codelex.classesandobjects.practice.Exercise_2;

public class Car {

    double startOdo;
    double endingOdo;
    double liters;

    public Car(double startOdo, double endingOdo, double liters) {
        this.startOdo = startOdo;
        this.endingOdo = endingOdo;
        this.liters = liters;
    }

    public double calculateConsumption() {
        return liters / (endingOdo - startOdo) * 100;
    }

    public final boolean gasHog() {
        if (calculateConsumption() >= 15) {
            return true;
        }
        return false;
    }

    public boolean economyCar() {
        if (calculateConsumption() <= 5) {
            return true;
        }
        return false;
    }
}
