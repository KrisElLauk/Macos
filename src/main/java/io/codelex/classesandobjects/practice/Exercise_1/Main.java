package io.codelex.classesandobjects.practice.Exercise_1;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Logitech mouse", 70.00, 14);
        Product product2 = new Product("iPhone 5s", 999.99, 3);
        Product product3 = new Product("Epson EB-U05", 440.46, 1);

        product1.setPriceAtStart(59.99);
        product1.setAmountAtStart(11);

        product1.printProduct();
        product2.printProduct();
        product3.printProduct();
    }
}
