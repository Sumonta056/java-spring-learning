package ExtraTopics.StreamLambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Wello");
        list.add("World");
        list.add("Java");
        list.add("Lambda");
        List<String> filter = new ArrayList<>();
        filter = list.stream().filter(e -> e.startsWith("W")).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(filter);
    }
}
