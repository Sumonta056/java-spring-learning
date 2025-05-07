package collections.arraylist.Questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConvertIteratorToList {
    public static void main(String[] args) {
        Iterator<String> iterator = List.of("example1", "example2", "example3").iterator();

        List<String> list = new ArrayList<>();
        iterator.forEachRemaining(list::add);

        // Print the list to verify the conversion
        System.out.println("List converted from iterator: " + list);


    }
}
