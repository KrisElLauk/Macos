package io.codelex.JavaAdvancedTests.Exercise2;

public class BasketApp {

    public static void main(String[] args) {

        Apple apple = new Apple();
        Basket<Apple> apples = new Basket<>();
        Basket<Mushrooms> shrooms = new Basket<>();

        apples.addToBasket(apple);
        apples.addToBasket(apple);
        apples.addToBasket(apple);
        apples.addToBasket(apple);
        apples.addToBasket(apple);
        apples.addToBasket(apple);
        apples.addToBasket(apple);
        apples.addToBasket(apple);
        apples.addToBasket(apple);
        apples.addToBasket(apple);
        apples.addToBasket(apple);
    }
}
