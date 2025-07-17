package nestedclasses;

public class OuterClass {

    static int outerVariable = 10;

    // Static nested class
    static class StaticInnerClass{
        String message = "Hello";
        void welcome(){
            System.out.println("Welcome to Static nested class!");
        }
    }

    // Non-static nested class
    class NonStaticInnerClass{
        void welcome(){
            System.out.println("Welcome to Non-static nested class!");
        }
    }

    // Local inner class
    void welcome(){
        class LocalInnerClass{
            void wecomeFromLocalInnerClas(){
                System.out.println("Welcome to Local Inner Class!");
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.wecomeFromLocalInnerClas();
    }

    // Anonymous inner class
    void welcomeAnonymous(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from Anonymous class!");
            }
        };
        runnable.run();
    }
}
