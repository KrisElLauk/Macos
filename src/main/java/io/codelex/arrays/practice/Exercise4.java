package io.codelex.arrays.practice;

public class Exercise4 {

    //TODO: Write a Java program to test if an array contains a specific value.
    public static void main(String[] args) {
        int[] myArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456
        };

        boolean result = false;
        //fixme - check if contains number 1245
        for (int i : myArray) {
           if (i == 1245) {
               result = true;
               break;
           }
        }
        if(result) {
            System.out.println("Contains!");
        } else {
            System.out.println("Does not contain.");
        }
    }
}
