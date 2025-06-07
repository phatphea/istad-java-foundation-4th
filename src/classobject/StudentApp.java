package classobject;

import java.util.Scanner;

public class StudentApp {

    public static String Red = "\u001B[31m";
    public static String Green = "\u001B[32m";
    public static String Reset = "\u001B[0m";

    static String[] students = {"Phea", "Sokkeang", "Sunnich"};
    static String username = "Phea";
    static String password = "phea";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentApp studentApp = new StudentApp();
        studentApp.printLabel();
        studentApp.printTitle("Student Application");

        //Login to a system
        boolean isLogin = true;
        while (isLogin){
            System.out.print("# User name: ");
            String uname = scanner.nextLine();
            System.out.print("# Password: ");
            String pw = scanner.nextLine();

            if(uname.equalsIgnoreCase(username) && pw.equalsIgnoreCase(password)){
                System.out.println(STR."================================================================");
                System.out.println(Green + "# Login Successful." + Reset);
                System.out.println(STR."================================================================");
                break;
            }
            else {
                System.out.println(STR."================================================================");
                System.out.println(Red + "Invalide username or password!!" + Reset);
                System.out.println(STR."================================================================");
            }
        }

        //print student
        studentApp.printStudents();

        System.out.println(STR."================================================================");
        String studentNameInput;
        do {
            System.out.print("Enter student name : ");
            studentNameInput = scanner.nextLine();
        }while (!studentApp.isFoundStudent(studentNameInput));

        System.out.print("Enter math score: ");
        double math = scanner.nextDouble();
        System.out.print("Enter physic score: ");
        double physic = scanner.nextDouble();
        System.out.print("Enter Khmer score: ");
        double khmer = scanner.nextDouble();
        System.out.println(STR."================================================================");
        studentApp.showStudentInfo(studentNameInput, math, physic, khmer);
        System.out.println(STR."================================================================");

    }

    /**
     * There are 4 types of method in java
     * 1. Method with no return type and no-parameter
     * 2. Method with no return type and with parameter
     * 3. Method with return type and no parameter
     * 4. Method with return type and parameter
     */

    //1. Method with no return type and no-parameter
    void printLabel(){
        System.out.println("""
                     
                     ██╗ █████╗ ██╗   ██╗ █████╗      █████╗ ██████╗ ██████╗\s
                     ██║██╔══██╗██║   ██║██╔══██╗    ██╔══██╗██╔══██╗██╔══██╗
                     ██║███████║██║   ██║███████║    ███████║██████╔╝██████╔╝
                ██   ██║██╔══██║╚██╗ ██╔╝██╔══██║    ██╔══██║██╔═══╝ ██╔═══╝\s
                ╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║    ██║  ██║██║     ██║    \s
                 ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝    ╚═╝  ╚═╝╚═╝     ╚═╝  \s
                """
        );
    }

    //2. Method with no return type and with parameter
    void printTitle(String tile){
        System.out.println(STR."===============| Welcome to \{tile} |===============");
    }
    void showStudentInfo(String name, double math, double physic, double khmer){
        System.out.println(STR."Student name is: \{name}");
        System.out.println(STR."Student math is: \{math}");
        System.out.println(STR."Student physic is: \{physic}");
        System.out.println(STR."Student khmer is: \{khmer}");

        double totalScore = sumScore(math, physic, khmer);
        System.out.println(STR."Total score is : \{totalScore}" );
    }

    //3. Method with return type and no parameter
    double sumScore(double math, double physic, double khmer){
        return math + physic + khmer;
    }

    void printStudents(){
        System.out.println("# All students: ");
        for(String student : students){
            System.out.print(student + ", ");
        }
        System.out.println();
    }

    boolean isFoundStudent(String name){
        boolean isfound = false;
        for (String student : students) {
            if (student.equalsIgnoreCase(name)) {
                isfound = true;
                break;
            }
        }

        if(!isfound){
            System.out.println(STR."================================================================");
            System.out.println(STR."\{Red}Student not exist!!\{Reset}");
            System.out.println(STR."================================================================");
        }

        return isfound;
    }
}
