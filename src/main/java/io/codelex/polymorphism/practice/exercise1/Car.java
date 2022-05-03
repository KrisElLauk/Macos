package io.codelex.polymorphism.practice.exercise1;

public interface Car {

    void speedUp();

    void slowDown();

    default String showCurrentSpeed() {
        return "Car is turned off";
    }

    void startEngine();
}
