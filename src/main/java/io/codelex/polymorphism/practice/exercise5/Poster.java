package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {

    private int height;
    private int width;
    private int numOfCopies;
    private int price;


    public Poster(int fee, int height, int width, int numOfCopies, int price) {
        super(fee);
        this.height = height;
        this.width = width;
        this.numOfCopies = numOfCopies;
        this.price = price;
    }

    @Override
    public int cost() {
        return super.cost() * price * numOfCopies;
    }

    @Override
    public String toString() {
        return super.toString() + " Poster{" +
                "height=" + height +
                ", width=" + width +
                ", numOfCopies=" + numOfCopies +
                ", price=" + price +
                "} ";
    }
}
