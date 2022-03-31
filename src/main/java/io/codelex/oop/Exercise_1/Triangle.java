package io.codelex.oop.Exercise_1;

public class Triangle extends Shape {

    private double width;
    private double height;

    public Triangle(int numSides, double width, double height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    double getArea() {
        return Math.floor((height * width) / 2);
    }

    @Override
    double getPerimeter() {
        double hypotenuse = Math.pow(Math.pow(width, 2) + Math.pow(height, 2), 0.5);
        return Math.floor(height + width + hypotenuse);
    }
}
