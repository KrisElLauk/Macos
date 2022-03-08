package io.codelex.classesandobjects.practice.Exercise_3;

public class Odometer extends FuelGauge {

    int mileage;
    int maxMileage = 999999;

    public void addingMileage(int mileage) {
        this.mileage = mileage;
        for (int i = 0; i < maxMileage; i++) {
            if (mileage <= maxMileage) {
                mileage = mileage + i;
            } else if (mileage > maxMileage) {
                mileage = 0;
            }
        }
    }

    public int fuelConsumption() {
        this.mileage = mileage + 10;
        System.out.println(burningFuel());

        return 0;
    }
}
