package classobject;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        Student.name = "PHAT PHEA"; // static variable
        student.uname = "Phea"; //install variable

        student.display();
        Student.printWelcome(); //call static method
        student.printWelcome(2026);
    }
}
