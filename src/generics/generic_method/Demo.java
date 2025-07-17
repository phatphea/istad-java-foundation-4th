package generics.generic_method;

public class Demo {

    public <T> void hello(T t){
        System.out.println(STR."Hi\{t}");
    }

    public <T> void printArray(T[] arr){
        for(T t : arr){
            System.out.print(t + " ");
        }
    }

    public <N extends Number> int sumArr(N[] arr){

        int sum = 0;
        for(N n : arr){
            sum = (int) n + sum;
        }

        return sum;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.<String>hello("Phea");

        String[] names = {"str1", "str2", "str3", "str4"};
        Integer[] ages = {2,3,4,5};

        demo.printArray(names);
        demo.printArray(ages);

        System.out.println("=================");
        System.out.println(demo.sumArr(ages));

    }
}
