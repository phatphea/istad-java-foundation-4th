// Java Program to Implementing Set Interface

import java.util.*;

public class CollectionDemo {

    public static void main(String args[]){

        // 🔸 Create ArrayList
        ArrayList<String> animals = new ArrayList<>();

        // 🔹 add(E e): Add to the end
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        System.out.println("After add: " + animals); // [Dog, Cat, Elephant]

        // 🔹 add(int index, E e): Insert at index
        animals.add(1, "Bird");
        System.out.println("After insert at index 1: " + animals); // [Dog, Bird, Cat, Elephant]

        // 🔹 get(int index): Access element
        String firstAnimal = animals.get(0);
        System.out.println("Element at index 0: " + firstAnimal); // Dog

        // 🔹 set(int index, E e): Update element
        animals.set(2, "Tiger");
        System.out.println("After update at index 2: " + animals); // [Dog, Bird, Tiger, Elephant]

        // 🔹 remove(int index): Remove by index
        animals.remove(3);
        System.out.println("After remove index 3: " + animals); // [Dog, Bird, Tiger]

        // 🔹 remove(Object o): Remove by value
        animals.remove("Bird");
        System.out.println("After remove 'Bird': " + animals); // [Dog, Tiger]

        // 🔹 contains(Object o): Check if element exists
        boolean hasDog = animals.contains("Dog");
        System.out.println("Contains 'Dog'? " + hasDog); // true

        // 🔹 size(): Number of elements
        System.out.println("Size of list: " + animals.size()); // 2

        // 🔹 clear(): Remove all elements
        animals.clear();
        System.out.println("After clear: " + animals); // []

    }
}