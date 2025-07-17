package nestedclasses;

import java.util.UUID;

public class StudentDemo extends Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.showInfo();

        System.out.println("==================================");
        Student phea = new Student("Istad001", "Phea", 23);
        phea.showInfo();

        System.out.println("============Example with generate id=============");
        Student student2 = new Student(UUID.randomUUID().toString(), "Thona", 21);
        student2.showInfo();

        System.out.println("============Example with call student by array=============");
        Student[] students = {
                new Student(UUID.randomUUID().toString(), "Thona", 20),
                new Student(UUID.randomUUID().toString(), "Kitya", 20),
                new Student(UUID.randomUUID().toString(), "Pathea", 20),
        };

        for (Student stu: students) {
            System.out.println(stu);
        }

        System.out.println("==================================");
        Student student3 = new Student();
        student3.createStudent();
        student3.showInfo();
    }
}
