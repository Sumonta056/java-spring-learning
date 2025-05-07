package ExtraTopics.StreamLambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Lambda");

        list.forEach(lists -> {
            System.out.println(lists);
        });

        Map<String, Integer> map = Map.of(
                "One", 1,
                "Two", 2,
                "Three", 3
        );

        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
    }
}
