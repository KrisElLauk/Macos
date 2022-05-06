package io.codelex.oop.Exercise_1;

abstract class Shape {

    int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    abstract double getArea();

    abstract double getPerimeter();
}
