package classobject;

public class Student {

    /**
     * There are 4 types of variable
     * 1. Static variable
     * 2. Instance variable
     * 3. Local variable
     * 4. Parameter
     */

    static String name; //1. static variable (varaible of class, that access by class)
    String uname; //2. instance variable (access by object)

    void display(){
        System.out.println("Name is " + Student.name);
        System.out.println("Username is " + this.uname);
    }

    static void printWelcome(){
        //3. local variable
        int year = 2025;
        System.out.println("Welcome to " + year);
    }

    //4. parameter variable
    void printWelcome(int year){
        System.out.println("Welcome to " + year);
    }

}
