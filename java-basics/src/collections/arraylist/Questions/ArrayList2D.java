package collections.arraylist.Questions;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2D {
    public static void main(String[] args) {
        List<List<String>> listOfLists = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        List<String> list2 = new ArrayList<>();
        list2.add("cherry");
        list2.add("date");
        listOfLists.add(list1);
        listOfLists.add(list2);
        System.out.println("List of lists: " + listOfLists);
    }
}
