package collections.arrayVsArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basics {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println(numbers[1]);  // 20

        // ArrayList
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(10);
        numbers1.add(20);
        numbers1.add(30);

        System.out.println(numbers1.get(1));  // 20

        String[] arr = {"apple", "banana"};
        List<String> list = Arrays.asList(arr);  // Array → List
        List<String> newList = new ArrayList<>(list);  // modifiable
        String[] arr2 = newList.toArray(new String[0]);  // List → Array

    }
}
