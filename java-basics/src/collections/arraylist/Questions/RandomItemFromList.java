package collections.arraylist.Questions;

import java.util.List;
import java.util.Random;

public class RandomItemFromList {
    public static void main(String[] args) {
        // Example list
        List<String> list = List.of("apple", "banana", "cherry", "date", "elderberry");

        Random random = new Random();

        // Get a random item from the list
        String randomItem = list.get(random.nextInt(list.size()));

        // Print the random item
        System.out.println("Random item from the list: " + randomItem);
    }
}
