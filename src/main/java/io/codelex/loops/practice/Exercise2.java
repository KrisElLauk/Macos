package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        int i, n;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();


        //todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        for (i = 0; i <= n; i++) {
            System.out.println(i * n);;
        }

    }

}
//////////////////reāli nezinu/////////////////