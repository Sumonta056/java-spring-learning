package collections.set.Questions.TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("orange");
        set.add("apple");
        set.add("banana");
        set.add("kiwi");
        TreeSet<String> duplicateSet = new TreeSet<>();
        duplicateSet.addAll(set);
        System.out.println("Original TreeSet: " + set);
        System.out.println(set.first() + set.last()); // first and last element

        System.out.println("Reversed TreeSet: " + set.reversed());
    }
}
