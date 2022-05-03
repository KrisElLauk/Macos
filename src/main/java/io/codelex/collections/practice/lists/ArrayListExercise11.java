package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> myList = new ArrayList<>();

        //TODO: Add 10 values to list
        myList.add("Pear");
        myList.add("Apple");
        myList.add("Watermelon");
        myList.add("Melon");
        myList.add("Pineapple");
        myList.add("Grapefruit");
        myList.add("Orange");
        myList.add("Lemon");
        myList.add("Kiwi");
        myList.add("Mango");

        //TODO: Add new value at 5th position
        myList.add(4, "Grape");

        //TODO: Change value at last position (Calculate last position programmatically)
        myList.set(myList.size() - 1, "Strawberries");

        //TODO: Sort your list in alphabetical order
        Collections.sort(myList);

        //TODO: Check if your list contains "Foobar" element
        if (myList.contains("Foobar")) {
            System.out.println("Containts element.");
        } else {
            System.out.println("Does not contain.");
        }

        //TODO: Print each element of list using loop
        for (String element : myList) {
            System.out.println(element);
        }
    }

}
