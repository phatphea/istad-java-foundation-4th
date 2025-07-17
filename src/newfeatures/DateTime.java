package newfeatures;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTime {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        LocalDate date = LocalDate.now().plusMonths(2);
        System.out.println(date);
        LocalDateTime addTime = LocalDateTime.now().plusMinutes(5);
        System.out.println(addTime.getMinute());
    }
}
