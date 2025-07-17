package collectionframeworks.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("phea", 23);
        map.put("thona", 20);
        map.put("thona", 20); //duplicated, ignore
        map.put(null, 30);
        map.put("Sokieang", null);
        map.put("Ranuth", null);

        System.out.println("Map: " + map);
        System.out.println("Phea: " + map.get("phea"));
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
