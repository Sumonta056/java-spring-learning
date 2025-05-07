package collections.arraylist.Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDuplicates {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana");
        list.add("date");
        list.add("banana");
        list.add("apple");

        System.out.println("Original List: " + list);

        Map<String, Integer> map = new HashMap<>();

        for (String item : list) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        System.out.println(map);
    }
}
