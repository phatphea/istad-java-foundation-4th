package collectionframeworks.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        List<Integer> values = new LinkedList<>();

        values.add(10);
        values.add(20);
        values.add(30);

        // Default
        System.out.println(values);

        // For each
        for (Integer value : values) {
            System.out.print(value + " ");
        }
        System.out.println();

        // For loop
        for (int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i) + " ");
        }
        System.out.println();

        // Iterator
        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

}
