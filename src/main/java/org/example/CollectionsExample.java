package org.example;

import java.util.*;

public class CollectionsExample {
    // Why use Collections?
    // 1. Reusability - : You don't have to write your own data structures (like a dynamic array or a linked list) from scratch.
    // 2. Performance - The standard library implementations are highly optimized for common use cases

    //  Collection Interface (The Root)
    // This is the most basic interface in the collections hierarchy
    // It defines the common behavior for any group of objects
    // You rarely work directly with Collection, but it sets the foundation for List, Set, and Queue.
    // Common Methods: add(), remove(), contains(), size(), isEmpty(), clear(), toArray().

    //              <-- Collection Interface -->
    //                   |          |          |
    //                List       Set        Queue
    //                   |          |          |
    //              ArrayList    HashSet    LinkedList (also implements List)
    //              LinkedList   LinkedHashSet  PriorityQueue
    //              Vector       TreeSet      ArrayDeque
    //              Stack
    //                   |
    //                   <-- Map Interface --> (Separate, not a 'Collection' per se, but part of the framework)
    //                   |          |          |
    //                 HashMap    LinkedHashMap  TreeMap
    //                 Hashtable
    public static void main(String[] args) {
        //  List Interface: Ordered Collections with Duplicates
        // Elements are stored in a specific order (the order in which they were added, or at a specific index).
        //  It allows duplicate elements.

        // Key Characteristics:
        //Ordered: Elements have a definite position.
        //Allows Duplicates: You can add the same element multiple times.
        //Index-based access: You can get an element using get(index).

        // Common List Implementations:
        // 1. ArrayList
        List<String> firstList = new ArrayList<>(); // Object for the ArrayList Class
        // Add elements
        firstList.add("Mango");
        firstList.add("Banana");
        firstList.add("Apple");
        firstList.add("Mango");

        System.out.println(firstList);

        String firstFruit = firstList.get(0);
        System.out.println(firstFruit);
        System.out.println(firstList.get(2));

        System.out.println(firstList.size());

        firstList.remove("Mango");
        System.out.println(firstList);
        System.out.println(firstList.get(0));

        System.out.println(firstList.contains("Mango"));
        System.out.println(firstList.contains("Kiwi"));

        firstList.remove(0);
        System.out.println(firstList);

        for(String fruit : firstList) {
            System.out.println(fruit);
        }

        firstList.clear();
        System.out.println(firstList);
        firstList.add("New one");
        System.out.println(firstList.isEmpty());

    }
}
