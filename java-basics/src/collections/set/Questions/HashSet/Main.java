package collections.set.Questions.HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("orange");
        set.add("apple");
        set.add("banana");
        set.add("kiwi");

        System.out.println(set);

        for(String values: set){
            System.out.println(values);
        }

        Set<String> duplicateSet = new HashSet<>(set);

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        //set.removeAll(set);
        System.out.println(set.isEmpty());

        System.out.println(duplicateSet);

        // coverting to array
        String[] array = new String[duplicateSet.size()];
        duplicateSet.toArray(array);
        for (String value : array) {
            System.out.println(value);
        }

        // converting to TreeSet
        Set<String> setTree = new TreeSet<>(duplicateSet);
        System.out.println(setTree);

    }
}
