package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise_6 {

    public static void main(String[] args) {

        int[] numbers1 = new int[10];
        int[] numbers2 = new int[numbers1.length];
        Random num = new Random();

        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = num.nextInt(100) + 1;
        }
        for (int j = 0; j < numbers2.length; j++) {
            numbers2[j] = numbers1[j];
        }

        numbers1[9] = -7;

        System.out.println("Array1: " + Arrays.toString(numbers1));
        System.out.println("Array2: " + Arrays.toString(numbers2));
    }
}
