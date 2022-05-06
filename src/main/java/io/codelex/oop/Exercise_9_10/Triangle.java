package io.codelex.oop.Exercise_9_10;

public class Triangle extends Shape {

    private final int width;
    private final int height;

    public Triangle(int width, int height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width * height) / 2.0;
    }

    @Override
    public double getPerimeter() {
        return width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
