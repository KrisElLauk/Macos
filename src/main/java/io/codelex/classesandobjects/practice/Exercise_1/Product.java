package io.codelex.classesandobjects.practice.Exercise_1;

public class Product {

    private String name;
    private double priceAtStart;
    private int amountAtStart;

    public Product(String name, double priceAtStart, int amountAtStart) {
            this.name = name;
            this.priceAtStart = priceAtStart;
            this.amountAtStart = amountAtStart;
        }

    public void printProduct() {
        System.out.println(name + ", " + "price " + priceAtStart + ", " + "amount " + amountAtStart);

    }

    public double getPriceAtStart() {
        return priceAtStart;
    }

    public void setPriceAtStart(double priceAtStart) {
        this.priceAtStart = priceAtStart;
    }

    public int getAmountAtStart() {
        return amountAtStart;
    }

    public void setAmountAtStart(int amountAtStart) {
        this.amountAtStart = amountAtStart;
    }
}

