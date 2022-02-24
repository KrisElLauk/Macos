package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        float average;
        float lowerBound = 1f;
        float upperBound = 100f;

        for (float number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }
        average = sum / upperBound;
        System.out.println(sum);
        System.out.println(average);
    }
}
