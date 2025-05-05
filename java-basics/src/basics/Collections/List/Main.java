package basics.Collections.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        System.out.println(names);

        List<String> namesLinks = new LinkedList<>();
        namesLinks.add("Alice");
        namesLinks.add("Bob");
        System.out.println(namesLinks);

        List<Integer> listNumbers = List.of(1, 2, 3, 4, 5, 6);

        var employees = new ArrayList<Employee>();
        employees.add(new Employee("Alice", 30));
        employees.add(new Employee("Bob", 25));

        System.out.println(employees);

        List<Integer> numbers = new ArrayList<>(2);
        System.out.println(numbers.size());
        System.out.println(numbers);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers.size());
        System.out.println(numbers);

    }
}
