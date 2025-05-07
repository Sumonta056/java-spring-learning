package collections.HashMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "Jack");
        map.put(4, "Jill");
        map.put(1, "John");
        map.put(2, "Jane");
        System.out.println(map); // Sorted by key

        System.out.println(map.keySet());
    }
}
