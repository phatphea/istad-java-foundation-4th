package newfeatures.table;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TableDemo {
    public static String Red = "\u001B[31m";
    public static String Green = "\u001B[32m";
    public static String Reset = "\u001B[0m";

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        for(int i=0; i<20; i++){
            personList.add(new Person((long)i, "Koko"+i, i+5, LocalDateTime.now()));
        }

        Table table = new Table(
                4,
                BorderStyle.UNICODE_BOX_DOUBLE_BORDER
        );

        table.addCell(Red + "   ID   " + Reset);
        table.addCell(Red + "   Name   " + Reset);
        table.addCell(Red + "   Age   " + Reset);
        table.addCell(Red + "   CreatedAt   " + Reset);

        for(Person p : personList){
            table.addCell(Green + p.getId().toString() + Reset);
            table.addCell(Green + p.getName() + Reset);
            table.addCell(Green + p.getAge().toString() + Reset);
            table.addCell(Green + p.getCreatedAt() + Reset);
        }

        System.out.println(table.render());
    }

}
