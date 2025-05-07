package collections.arraylist.Questions;

import java.util.Arrays;
import java.util.List;

public class UnSupportedOperation {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b");
        list.add("c"); // throws UnsupportedOperationException
    }
}
