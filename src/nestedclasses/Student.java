package nestedclasses;

import java.util.Scanner;
import java.util.UUID;

// parent class
public class Student {
    //state or instance variable
    String id;
    String name;
    int age;
    String address;

    //behavior
    void showInfo(){
        System.out.println("Student ID: " + this.id);
        System.out.println("Student name: " + this.name);
        System.out.println("Student age: " + this.age);
        System.out.println("Address: " + this.address);
    }

    void createStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    Student(){
        this("Unknown", "Unknown", 0); //invoke to
    }

    Student(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //generate using tostring()
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
