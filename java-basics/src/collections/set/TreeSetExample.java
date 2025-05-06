package collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("orange");
        set.add("apple");
        set.add("banana");
        set.add("apple");
        System.out.println(set.size());
        System.out.println(set); // Sorted order, no duplicates
    }
}
