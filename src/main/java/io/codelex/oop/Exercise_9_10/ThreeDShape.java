package io.codelex.oop.Exercise_9_10;

public abstract class ThreeDShape extends Shape {


    public ThreeDShape(int numSides) {
        super(numSides);
    }

    public abstract double calculateVolume();
}
