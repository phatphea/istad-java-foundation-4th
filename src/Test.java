public class Test {

    static class MyClass {
        int x;
        int y;

        // Constructor 1
        public MyClass() {
            this(0, 0); // Calls Constructor 2
//            System.out.println("Constructor 1 called");
        }

        // Constructor 2
        public MyClass(int x, int y) {
            this.x = x;
            this.y = y;
//            System.out.println("Constructor 2 called");
        }
    }
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Creates an object using Constructor 1
        System.out.println("x = " + obj.x + ", y = " + obj.y);
        Test test = new Test();

    }

}
