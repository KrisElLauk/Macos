package io.codelex.collections.practice.Exercise4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Set<String> uniqueNames = new HashSet<>();

        while (true) {
            System.out.print("Enter names: ");
            String names = input.nextLine();
            if (names.isEmpty()) {
                break;
            } else {
                uniqueNames.add(names);
            }
        }
        System.out.println("Unique name list contains: " + uniqueNames);
    }
}
