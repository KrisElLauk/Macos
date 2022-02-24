package io.codelex.arithmetic.practice;

public class Exercise_1 {

    public static boolean checkIfTrue(int num1, int num2) {
        if (num1 == 15 || num2 == 15)
            return true;
        return ((num1 + num2) == 15 || Math.abs(num1 - num2) == 15);  //Kādēļ otrs return?
    }

    public static void main(String[] args) {

        System.out.println(checkIfTrue(15, 0));

    }
}
