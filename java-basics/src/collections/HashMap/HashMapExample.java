package collections.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("John", "Doe");
        map.put("Jane", "Smith");
        System.out.println("Initial HashMap: " + map);
        System.out.println(map.size());
        Map<String, String>map2 = new HashMap<>(map); // Copying HashMap
        map2.putAll(map); // Merging two HashMaps
        System.out.println(map2);


        // Checking if a key or value exists in the HashMap
        if(map.containsKey("John")) {
            System.out.println("Key 'John' exists in the map.");
            System.out.println(map.get("John"));
        } else {
            System.out.println("Key 'John' does not exist in the map.");
        }
        // Checking if a value exists in the HashMap
        if(map.containsValue("Doe")) {
            System.out.println("Value 'Doe' exists in the map.");
        } else {
            System.out.println("Value 'Doe' does not exist in the map.");
        }

        Set set = map.entrySet();
        Set set2 =map.keySet();
        Collection<String> set3 = map.values();
        System.out.println(set);
        System.out.println(set2);
        System.out.println(set3);
    }
}
