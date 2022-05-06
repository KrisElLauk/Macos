package io.codelex.oop.Exercise_9_10;

public class Rectangle extends Shape {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        super(4);
        this.width = width;
        this.height = height;
    }


    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }
}
