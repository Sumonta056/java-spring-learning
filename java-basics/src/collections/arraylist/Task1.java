package collections.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        // Task - 1; Write a Java program to create an array list, add some colors (strings) and print out the collection.
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Pink");
        System.out.println(colors);

        // Task - 2; Write a Java program to iterate through all elements in an array list.
        for (String element : colors) {
            System.out.println(element);
            System.out.println("-----------------");
        }

        // Task - 3; Write a Java program to insert an element into the array list at the first position.
        colors.add(0, "Black");
        colors.add(2, "Black");
        colors.add(5, "Black");
        System.out.println(colors);

        // Task - 4; Write a Java program to retrieve an element (at a specified index) from a given array list.

        String elementAtIndex3 = colors.get(3);
        System.out.println("Element at index 3: " + elementAtIndex3);

        // Task - 5; Write a Java program to update specific array element by given element.

        colors.set(0, "Starting");
        System.out.println(colors);

        // Task - 6; Write a Java program to remove the first element from an array list.

        colors.remove(0);
        System.out.println(colors);

        // Task - 7; Write a Java program to search an element in an array list.

        String searchElement = "Blue";
        if (colors.contains(searchElement)) {
            System.out.println("Element " + searchElement + " found in the list.");
        } else {
            System.out.println("Element " + searchElement + " not found in the list.");
        }

        // Task - 8; Write a Java program to sort a given array list.
        Collections.sort(colors);
        System.out.println("Sorted colors: " + colors);


        // Task - 9 : Copy one array list into another.
        List<String> colorsCopy = new ArrayList<>(colors);
        System.out.println(colorsCopy);

        // Task - 10 : Compare two array lists.
        if (colors.equals(colorsCopy)) {
            System.out.println("Both lists are equal.");
        } else {
            System.out.println("Lists are not equal.");
        }

        // Task - 11 : Reverse elements in an array list.
        Collections.reverse(colors);
        System.out.println("Reversed colors: " + colors);

        // Task - 12 : Extract a portion of an array list.
        List<String> subColor = colors.subList(0, 3);
        System.out.println("Sublist of colors: " + subColor);

        // Task - 13 : Swap two elements in an array list.
        Collections.swap(colors, 0, 1);
        System.out.println("Swapped colors: " + colors);


        // Task - 14: Write a Java program to join two array lists.
        List<String> additionalColors = new ArrayList<>();
        additionalColors.add("Orange");
        additionalColors.addAll(colorsCopy);
        System.out.println(additionalColors);

        // Task - 15: Remove all elements from a given array list.
        additionalColors.removeAll(additionalColors);
        System.out.println("After removing all elements: " + additionalColors);
        additionalColors.addAll(colorsCopy);
        System.out.println(additionalColors);
        additionalColors.clear();
        System.out.println(additionalColors);

        // Task - 16: Print all the elements of an ArrayList using the position of the elements.
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Element at index " + i + ": " + colors.get(i));
        }


    }
}
