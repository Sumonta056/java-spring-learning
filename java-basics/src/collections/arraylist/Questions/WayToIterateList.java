package collections.arraylist.Questions;

import java.util.Iterator;
import java.util.List;

public class WayToIterateList {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "cherry");
        // For-each
        for (String item : list) {
            System.out.println(item);
        }

        // Iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // forEach with lambda
        list.forEach(System.out::println);


    }
}
