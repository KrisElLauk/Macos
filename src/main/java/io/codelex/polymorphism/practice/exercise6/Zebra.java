package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {

    public Zebra(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }


    @Override
    public void makeSound() {
        System.out.println(".......");
    }

    @Override
    public void eatFood(int quantity) {
        setFoodEaten(quantity);
    }
}
