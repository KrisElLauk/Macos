package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        List<String> listedArray = Arrays.asList(array);
        System.out.println(listedArray);

        //todo - replace array with a HashSet and print out the results
        Set<String> hashedArray = new HashSet<>(Arrays.asList(array));
        System.out.println(hashedArray);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        Map<String, String> mappedArray = new HashMap<>();
        mappedArray.put("Audi", "Germany");
        mappedArray.put("BMW", "Germany");
        mappedArray.put("Honda", "Japan");
        mappedArray.put("Mercedes", "Germany");
        mappedArray.put("VolksWagen", "Germany");
        mappedArray.put("Tesla", "USA");

        System.out.println(mappedArray);
    }
}
