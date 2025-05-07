package collections.arraylist.Questions;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add("Grapes");

        list = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list);
    }
}
