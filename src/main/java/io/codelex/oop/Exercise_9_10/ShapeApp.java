package io.codelex.oop.Exercise_9_10;

public class ShapeApp {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(3, 4);
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Area: " + triangle.getArea());

        Rectangle rectangle = new Rectangle(4, 4);
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());

        Hexagon hexagon = new Hexagon(4);
        System.out.println("Perimeter: " + hexagon.getPerimeter());
        System.out.println("Area: " + hexagon.getArea());

        Cone cone = new Cone(6, 8);
        System.out.println("Perimeter: " + cone.getPerimeter());
        System.out.println("Area: " + cone.getArea());
        System.out.println("Volume: " + cone.calculateVolume());

        Qube qube = new Qube(6);
        System.out.println("Perimeter: " + qube.getPerimeter());
        System.out.println("Area: " + qube.getArea());
        System.out.println("Volume: " + qube.calculateVolume());
    }
}
