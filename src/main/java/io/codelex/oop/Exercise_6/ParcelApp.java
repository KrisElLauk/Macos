package io.codelex.oop.Exercise_6;

import java.util.Scanner;

public class ParcelApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input x value: ");
        int x = input.nextInt();
        System.out.println("Input y value: ");
        int y = input.nextInt();
        System.out.println("Input z value: ");
        int z = input.nextInt();
        System.out.println("Input weight value: ");
        float f = input.nextFloat();

        Parcel parcel = new Parcel(x, y, z, f);
        System.out.println("Parcel is valid: " + parcel.validate());
    }
}
