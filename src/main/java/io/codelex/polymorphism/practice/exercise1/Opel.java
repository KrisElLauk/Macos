package io.codelex.polymorphism.practice.exercise1;

public class Opel implements Car {
    private Integer currentSpeed = 0;


    @Override
    public void speedUp() {
        currentSpeed += 10;
    }

    @Override
    public void slowDown() {
        currentSpeed += 3;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Br..br..br..VROOOM");
    }

    @Override
    public String toString() {
        return "Opel{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
