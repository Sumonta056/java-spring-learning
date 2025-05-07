package collections.arraylist.Questions;

import java.util.ArrayList;
import java.util.List;

public class PartitionList {
    public static void main(String[] args) {
        // Partition a list based on size
        List<String> list = List.of("apple", "banana", "cherry", "date", "elderberry");
        int partitionSize = 2;
        List<List<String>> partitionedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i += partitionSize) {
            partitionedList.add(list.subList(i, Math.min(i + partitionSize, list.size())));
            // Here is ( range start index, range end index )
        }
        // Print the partitioned list
        System.out.println("Partitioned list: " + partitionedList);
    }
}
