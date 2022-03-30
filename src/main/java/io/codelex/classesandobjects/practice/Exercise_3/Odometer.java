package io.codelex.classesandobjects.practice.Exercise_3;

public class Odometer {

    private double mileage;
    private double startingMileage;
    private double maxMileage = 999999;
    private final double kmPerLiters = 10;
    private FuelGauge fuelGauge;

    public Odometer(double mileage, FuelGauge fuelGauge) {
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;
    }

    public double getMileage() {
        return mileage;
    }

    public void addMileage() {
        if (mileage < maxMileage) {
            this.mileage++;
        } else {
            mileage = 0;
        }
        double kmDriven = mileage - startingMileage;
        if (kmDriven % kmPerLiters == 0) {
            fuelGauge.burningFuel();
        }
    }
}
