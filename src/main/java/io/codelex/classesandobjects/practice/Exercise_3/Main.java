package io.codelex.classesandobjects.practice.Exercise_3;

public class Main {

    public static void main(String[] args) {

        FuelGauge fuelGauge = new FuelGauge(35);
        Odometer carOdometer = new Odometer(0, fuelGauge);

        System.out.println(fuelGauge.getCurrentFuel());
        System.out.println(carOdometer.getMileage());

        for (double i = fuelGauge.getCurrentFuel(); i < FuelGauge.maxFuel; i++) {
            if (fuelGauge.getCurrentFuel() < FuelGauge.maxFuel) {
                fuelGauge.fillingCar();
            }
        }

        while (fuelGauge.getCurrentFuel() > 0) {
            carOdometer.addMileage();
            System.out.println("Fuel in tank: " + fuelGauge.getCurrentFuel() + "\nMileage: " + carOdometer.getMileage());
        }
    }
}

///////////////////////////KAUT KAS PĀRTAISĪTS UN PUSLĪDZ STRĀDĀJOŠ/////////////////////////