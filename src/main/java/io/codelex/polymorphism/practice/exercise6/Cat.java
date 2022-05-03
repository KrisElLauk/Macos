package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {

    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eatFood(int quantity) {
        setFoodEaten(quantity);
    }

    @Override
    public String toString() {
        return "Cat[" + getAnimalName() + ", " +
                getBreed() + ", " +
                getAnimalWeight() + ", " +
                getLivingRegion() + ", " +
                getFoodEaten() + "]";
    }
}
