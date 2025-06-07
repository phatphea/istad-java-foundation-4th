package classobject;

public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog("This is breed", "Black", Dog.Size.SMALL);
        dog.display();
        System.out.println("===================================");
        dog2.display();
    }
}
