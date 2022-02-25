package io.codelex.arithmetic.practice;

public class Exercise_4 {

    public static void Product1ToN(int N) {
        int product = 1;
        for (int num1 = 1; num1 <= 10; num1++) {
           product *= num1;
        }
        System.out.println(product);
    }

    public static void main(String[] args) {

        Product1ToN(1);
    }
}
