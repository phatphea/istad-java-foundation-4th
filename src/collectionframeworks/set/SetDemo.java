package collectionframeworks.set;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> avengers = new HashSet<>();

        avengers.add("thor");
        avengers.add("ironman");
        avengers.add("black widow");
        avengers.add("hawkeye");
        avengers.add("hulk");

        System.out.println(avengers);

        if (avengers.contains("thor")) {
            System.out.println("We gonna win");
        }

        System.out.println("Member of avengers have: " + avengers.size());

        List<Integer> numbers = new ArrayList<>() {{
            add(10);
            add(10);
            add(20);
            add(30);
            add(15);
            add(50);
        }};

        System.out.println(STR."List: \{numbers}");

        Set<Integer> setNumberFromList = new HashSet<>(numbers);
        System.out.println(STR."Set: \{setNumberFromList}");

        Set<Integer> treeSetFromSet = new TreeSet<>(setNumberFromList);
        System.out.println(STR."TreeSet: \{treeSetFromSet}");

        Set<Integer> decendingTreeSet = new TreeSet<>(Comparator.reverseOrder());
        decendingTreeSet.addAll(treeSetFromSet);
        System.out.println(STR."Decending TreeSet: \{decendingTreeSet}" );
    }
}
