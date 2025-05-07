package collections.arraylist.Questions;

import java.util.List;

public class CheckTwoListEqual {
    public static void main(String[] args) {
        // Task - 10 : Compare two array lists
        List<String> list1 = List.of("apple", "banana", "cherry");
        List<String> list2 = List.of("apple", "banana", "cherry");
        List<String> list3 = List.of("apple", "banana", "grape");

        if (list1.equals(list2)) {
            System.out.println("The two lists are equal.");
            if(list1.equals(list3)) {
                System.out.println("The two lists are equal.");
            } else {
                System.out.println("The two lists are not equal.");
            }
        } else {
            System.out.println("The two lists are not equal.");
        }
    }
}
