package newfeatures.streamAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>(){{
            add(10);
            add(5);
            add(40);
            add(60);
            add(50);
        }};

        System.out.println(
                number.stream()
                .filter(i -> i<40) // Intermediate operation
                .map(i -> i + 2)
                .collect(Collectors.toList()) // Terminal operation
        );

        System.out.println(
                number.stream()
                        .reduce(Integer::sum)
        );

        System.out.println(
                number.stream()
                        .toList()
        );

        System.out.println(
                number.stream()
                        .sorted()
                        .toList()
        );

        System.out.println(
                number.stream()
                        .sorted(Comparator.reverseOrder())
                        .toList()
        );

        System.out.println(
                number.stream()
                        .sorted()
                        .findFirst()
        );

    }

}
