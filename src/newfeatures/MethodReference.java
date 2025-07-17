package newfeatures;

interface Greeting2 {
    String hello(String name);
}

interface Greeting3 {
    MethodReference hello(String name);
}

public class MethodReference {

    // Reference to static method
    static String hi(String name) {
        return name.toUpperCase();
    }

    // Reference to instance method
    String hi2(String name) {
        return name.toLowerCase();
    }

    // Referent to a constructor
    MethodReference(String name) {
        System.out.println(name);
    }

    MethodReference() {}

    public static void main(String[] args) {

//        Greeting2 gt2 = name -> name.toUpperCase();
        Greeting2 gt2 = String::toUpperCase;
        System.out.println(gt2.hello("Thona"));

        Greeting2 anotherGt2 = MethodReference::hi;
        System.out.println(anotherGt2.hello("Sunnich"));

        MethodReference mr = new MethodReference();
        Greeting2 gt3 = mr::hi2; // object mr reference to its method hi2()
        System.out.println(gt3.hello("Ranuth"));

        Greeting3 gt = MethodReference::new;
        gt.hello("Phea");

    }

}
