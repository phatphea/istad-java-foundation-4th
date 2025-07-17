package newfeatures.streamAPI;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamDemo {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>(){{
            add(new Person(1L, "thona", 18, LocalDateTime.now().minusDays(5)));
            add(new Person(2L, "sreynich", 18, LocalDateTime.now()));
            add(new Person(3L, "sreyhoung", 18, LocalDateTime.now().minusMonths(1)));
            add(new Person(4L, "ranuth", 18, LocalDateTime.now().minusDays(2)));
            add(new Person(5L, "phea", 18, LocalDateTime.now().minusDays(3)));
            add(new Person(6L, "pathea", 18, LocalDateTime.now().minusDays(7)));
            add(new Person(7L, "sengkim", 18, LocalDateTime.now().minusDays(8)));
            add(new Person(8L, "kitya", 18, LocalDateTime.now().minusDays(9)));
            add(new Person(9L, "mengleang", 18, LocalDateTime.now().minusDays(4)));
            add(new Person(10L, "kaknika", 18, LocalDateTime.now().minusDays(12)));
            add(new Person(11L, "kongkea", 18, LocalDateTime.now().minusDays(2)));
            add(new Person(12L, "kimlong", 18, LocalDateTime.now().minusDays(2)));
            add(new Person(13L, "sokkheng", 18, LocalDateTime.now().minusDays(2)));
            add(new Person(14L, "rathanak", 18, LocalDateTime.now().minusDays(2)));
            add(new Person(15L, "menghor", 18, LocalDateTime.now().minusDays(2)));
            add(new Person(16L, "sokkeang", 18, LocalDateTime.now().minusDays(2)));
            add(new Person(17L, "sunnich", 18, LocalDateTime.now().minusDays(2)));
            add(new Person(18L, "phearon", 18, LocalDateTime.now().minusDays(2)));
            add(new Person(19L, "nita", 18, LocalDateTime.now().minusDays(2)));
        }};

        List<Person> filtered1 = personList.stream()
                .filter(person -> person.getName().toLowerCase().startsWith("k"))
                .toList();
        filtered1.forEach(System.out::println);

        System.out.println("=====================================================================");

        // filter for person who has name length 4 characters
        List<Person> filtered2 = personList.stream()
                .filter(person -> person.getName().length() == 4)
                .toList();
        filtered2.forEach(System.out::println);

        System.out.println("=====================================================================");

        // filter for person who just created 7 days ago
        List<Person> filtered3 = personList.stream()
                .filter(person -> person.getCreatedAt().isAfter(LocalDateTime.now().minusWeeks(1)))
                .toList();
        filtered3.forEach(System.out::println);

        System.out.println("=====================================================================");

        // filter for person who has name start with "r" and convert to uppercase
        List<Person> filtered4 = personList.stream()
                .filter(person -> person.getName().startsWith("r"))
                .map(person -> new Person(person.getId(), person.getName().toUpperCase(), person.getAge(), person.getCreatedAt()))
                .toList();
        filtered4.forEach(System.out::println);

        System.out.println("=====================================================================");

        Optional<Person> searchPerson = personList.stream()
                .filter(person -> person.getId() == 22L)
                .findFirst();
        System.out.println(searchPerson);

    }

}
