package io.codelex.classesandobjects.practice.Exercise_3;

public class Main {

    public static void main(String[] args) {

        Odometer car = new Odometer();

        System.out.println("Filling up your car.");
        car.fillingCar(55, 70);
        System.out.println("Tank is full.");

        car.addingMileage(152190);
        for (int i = 0; i >= car.mileage; i++) {

            System.out.println(car.fuelConsumption());
        }

    }
}

/////////////////////////NEPABEIGTS///////////////////////