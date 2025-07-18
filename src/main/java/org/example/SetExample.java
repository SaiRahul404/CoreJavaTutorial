package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {
    //  Set Interface: Unordered Collections without Duplicates

    // A Set is a collection that does not allow duplicate elements.
    // Key Characteristics:
    //No Duplicates: Each element must be unique.
    //Unordered (generally): Elements typically don't maintain insertion order.
    //No index-based access: You cannot get an element by get(index).

    // HashSet:
    // Best for: Very fast addition, removal, and lookup (contains()) operations
    // Does NOT guarantee order. Elements are stored based on their hash code.

    // LinkedHashSet:
    // Guarantees insertion order. Elements are retrieved in the order they were inserted.
    public static void main(String[] args) {
        // // 1. Declare a Set using the interface, instantiate with HashSet
        Set<String> uniqueColors = new HashSet<>(); // object for hashset

        uniqueColors.add("Green");
        uniqueColors.add("Red");
        uniqueColors.add("Blue");
        uniqueColors.add("Red"); // // Adding "Red" again has no effect

        System.out.println(uniqueColors);
        System.out.println("Number of unique colors: " + uniqueColors.size());

        System.out.println("Contains 'Purple'? " + uniqueColors.contains("Purple"));

        uniqueColors.remove("Green");
        System.out.println(uniqueColors);

        for(String color : uniqueColors) {
            System.out.println(color);
        }

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(1);
        System.out.println(set1);

        for(Integer a : set1) {
            System.out.println(a);
        }



    }
}
