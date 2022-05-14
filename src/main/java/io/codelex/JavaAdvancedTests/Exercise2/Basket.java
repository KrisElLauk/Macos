package io.codelex.JavaAdvancedTests.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    List<T> items;

    public Basket() {
        this.items = new ArrayList<>(11);
    }

    public void addToBasket(T item) {
        items.add(item);
        System.out.println(items.size());
        try {
            if (items.size() == 10) {
                throw new BasketFullException("Error!");
            }
        } catch (BasketFullException e) {
            System.out.println("Basket is full!");

        }
    }

    public void removeFromBasket(T item) {
        items.remove(item);
        try {
            if (items.isEmpty()) {
                throw new BasketEmptyException("Error!");
            }
        } catch (BasketEmptyException e) {
            System.out.println("Basket is empty!");
        }
    }
}
