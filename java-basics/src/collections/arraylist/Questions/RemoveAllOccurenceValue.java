package collections.arraylist.Questions;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllOccurenceValue {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana");
        list.add("date");
        list.add("banana");

        System.out.println(list);

        list.removeIf(e -> e.equals("banana"));
        System.out.println(list);
    }
}
