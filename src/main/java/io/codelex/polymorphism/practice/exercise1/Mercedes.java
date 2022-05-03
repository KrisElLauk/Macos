package io.codelex.polymorphism.practice.exercise1;

public class Mercedes implements Car, Boost {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 15;
    }

    @Override
    public void slowDown() {
        currentSpeed += 5;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Br....Brrrrrrrrrrrr");
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 70;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
