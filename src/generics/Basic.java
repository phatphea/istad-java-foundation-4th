package generics;

import generics.generic_class.Box;
import generics.generic_class.CustomMap;

import java.util.ArrayList;
import java.util.List;

public class Basic {

    public static void main(String[] args) {

        List<String> values = new ArrayList<>();
        values.add("Hello");
        System.out.println(values);

        // create object Box
        Box<String> box = new Box<>();
        box.setT("Hello");
        System.out.println(box.getT());

        Box<Integer> box2 = new Box<>();
        box2.setT(10);
        System.out.println(box2.getT());


        CustomMap<String, Integer> customMap = new CustomMap<>();
        customMap.put("Apple", 15);
        System.out.println("Apple have: " +  customMap.get("Apple"));
        customMap.put("Orange", 20);
        System.out.println("Orange have: " +  customMap.get("Orange"));
    }

}
