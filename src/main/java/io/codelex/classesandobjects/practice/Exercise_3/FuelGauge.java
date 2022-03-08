package io.codelex.classesandobjects.practice.Exercise_3;

public class FuelGauge {

    private int maxFuel = 70;
    private int currentFuel;



    public void fillingCar(int currentFuel, int maxFuel) {
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
        for (int i = currentFuel; i <= maxFuel; i++) {
            if (currentFuel < maxFuel) {
                System.out.println(i);
                if (currentFuel == maxFuel) {
                    System.out.println("Your tank is full");
                }
            }

        }
    }

    public double burningFuel() {

        if (currentFuel > 0) {
           return currentFuel = currentFuel - 1;
        }
        return 0;
    }

}
