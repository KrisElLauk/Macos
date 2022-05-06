package io.codelex.oop.Exercise_9_10;

public class Qube extends ThreeDShape {

    private final int length;

    public Qube(int length) {
        super(6);
        this.length = length;
    }

    @Override
    public double calculateVolume() {
        return length * length * length;
    }

    @Override
    public double getArea() {
        return 6 * (length * length);
    }

    @Override
    public double getPerimeter() {
        return 12 * length;
    }


}
