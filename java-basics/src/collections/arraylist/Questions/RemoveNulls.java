package collections.arraylist.Questions;

import java.util.Objects;

public class RemoveNulls {
    public static void main(String[] args) {
        // Create an ArrayList with some null values
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("Hello");
        list.add(null);
        list.add("World");
        list.add(null);
        list.add("Java");

        // Print the original list
        System.out.println("Original List: " + list);

        // Remove null values from the list
        list.removeIf(Objects::isNull);

        // Print the modified list
        System.out.println("List after removing nulls: " + list);
    }
}
