package collections.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Basics {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 20);
        map.put("Jane", 22);
        map.put("Jack", 21);
        map.put(null, 0); // allow null key
        System.out.println(map);

        // key must be unique, value can be duplicate
        // If we add a key that already exists, the value will be updated
        System.out.println(map.get("John"));
        map.put("John", 25);
        System.out.println(map.get("John"));

        // Iterating over the map
        for(Map.Entry<String, Integer> entity : map.entrySet()){
            System.out.println(entity.getKey() + " : " + entity.getValue());
        }

        // Lambda expression to iterate over the map
        map.forEach((k,v) -> System.out.println(k + " : " + v));

        Map<String, Integer> map2 = new HashMap<>(Map.of("Alice", 30, "Bob", 35));
        System.out.println(map2);

        // Merging two maps
        map2.putAll(map);
        System.out.println(map2);

        // Sorting the map by key
        map2.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);


        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("C", 3);
        treeMap.put("A", 1);
        treeMap.put("B", 2);

        treeMap.forEach((k, v) -> System.out.println(k + ": " + v));


    }
}
