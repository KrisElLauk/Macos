package io.codelex.oop.Exercise_1;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 17.3, 27.5);
        Triangle triangle = new Triangle(3, 19.7, 14.1);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        System.out.println();

        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}
