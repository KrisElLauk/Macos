package io.codelex.oop.Exercise_9_10;

public class Cone extends ThreeDShape {

    private final int radius;
    private final int height;

    public Cone(int radius, int height) {
        super(2);
        this.radius = radius;
        this.height = height;
    }


    @Override
    public double getArea() {
        double length = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * length;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (radius + radius);
    }

    @Override
    public double calculateVolume() {
        return (Math.PI * radius * radius * height) / 3;
    }
}
