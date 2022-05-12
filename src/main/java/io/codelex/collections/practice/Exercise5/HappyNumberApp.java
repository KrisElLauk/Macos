package io.codelex.collections.practice.Exercise5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumberApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Write a number: ");
        int number = input.nextInt();
        if (isHappy(number)) {
            System.out.println(number + " is a happy number! :)");
        } else {
            System.out.println(number + " is not a happy number! :(");
        }
    }

    public static boolean isHappy(int number) {
        Set<Integer> num = new HashSet<>();

        while (num.add(number)) {
            int value = 0;
            while (number > 0) {
                value += Math.pow(number % 10, 2);
                number /= 10;
            }
            number = value;
        }
        return number == 1;
    }
}
