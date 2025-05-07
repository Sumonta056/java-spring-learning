package collections.arraylist.Questions;

import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "cherry", "date", "elderberry");

        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("banana")) {
                list.remove(i);
                break;
            }
        }
    }
}
