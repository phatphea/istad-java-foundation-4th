package nestedclasses;

public class DemoNestedClass {
    public static void main(String[] args) {

        //Object of static nested class
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        staticInnerClass.welcome();

        System.out.println("==========================");

        //Object of non-static nested class
        OuterClass outerClass = new OuterClass();
        OuterClass.NonStaticInnerClass innerClass = outerClass.new NonStaticInnerClass();
        innerClass.welcome();

        System.out.println("==========================");

        //call to Local Inner Class
        outerClass.welcome();

        System.out.println("==========================");

        //call to Anonymous class
        outerClass.welcomeAnonymous();
    }
}
