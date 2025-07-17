package collectionframeworks.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        // CollectionInterface name = new ClassImplementation();
        List<Integer> numbers = new ArrayList<>();

        // Constant time : O(1)
        numbers.add(18);
        numbers.add(1);
        numbers.add(5);
        numbers.add(18);
        numbers.add(8);

        System.out.println(numbers.get(2));

        System.out.println(numbers);

        // Linear time :  O(n)
        numbers.add(1, 2);

        System.out.println("First list: " + numbers);


        List<Integer> secondList = new ArrayList<>(numbers);
        System.out.println("Second list: " + secondList);

        if (secondList.contains(10)) {
            System.out.println("Element is existed");
        } else {
            System.out.println("Element not found");
        }

        if (!secondList.isEmpty()) {
            System.out.println("Element is not empty");
        }

        List<Integer> thirdList = Arrays.asList(7, 7, 7);
        secondList.addAll(thirdList);

        System.out.println(secondList);
        secondList.addAll(0, thirdList);
        System.out.println(secondList);

        secondList.set(7, 19);
        System.out.println(secondList);

//        secondList.remove(2); : by default it will take index as argument
        secondList.remove(Integer.valueOf(2)); // convert number to Integer object
        System.out.println(secondList);

        secondList.removeAll(thirdList);

        System.out.println(secondList);

    }

}
