package newfeatures;

interface Greeting {
    void hello(String name);
}

interface Sum {
    int sumThreeNums(int a, int b, int c);
}

// to implement method in interface
class SumImpl implements Sum {

    @Override
    public int sumThreeNums(int a, int b, int c) {
        return a + b + c;
    }

}

public class Lambda {

    public static void main(String[] args) {

        Greeting greeting = n -> System.out.println("Hi " + n);

        Greeting greeting2 = n -> {
            // use {} when you have more than one statement
            System.out.println("Hi " + n);
            System.out.println("Your name is: " + n);
        };

        greeting.hello("Clark");

        Sum sum = (a, b, c) -> a + b + c;

        System.out.println(sum.sumThreeNums(3, 4, 5));

    }
}
