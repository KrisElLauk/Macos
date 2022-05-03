package io.codelex.polymorphism.practice.exercise1;

public class Bmw implements Car {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 12;
    }

    @Override
    public void slowDown() {
        currentSpeed += 12;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
