package collections.set.Questions.HashSet;

import java.util.HashSet;
import java.util.Set;

public class CompareHashSets {
    public static void main(String[] args) {
        // Create two HashSets
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Banan");
        set2.add("Cherry");
        set2.add("Apple");

        // Compare the two HashSets
        if (set1.equals(set2)) {
            System.out.println("The two HashSets are equal.");
        } else {
            System.out.println("The two HashSets are not equal.");
        }

        // Values that are in set1 & set2
        set1.retainAll(set2);
        System.out.println("After retainAll, set1: " + set1);
    }
}
