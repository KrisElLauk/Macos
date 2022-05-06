package io.codelex.oop.Exercise_1;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(int numSides, double width, double height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }


    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }
}
