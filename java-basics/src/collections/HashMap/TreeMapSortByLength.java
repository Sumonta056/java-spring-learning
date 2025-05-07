package collections.HashMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSortByLength {

    static Comparator<String> lengthComparator = (s1, s2) -> {
        int lenCompare = Integer.compare(s1.length(), s2.length());
        // If lengths are equal, compare alphabetically to avoid overwriting
        return (lenCompare != 0) ? lenCompare : s1.compareTo(s2);
    };

    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>(lengthComparator);

        // Add entries to the map
        map.put("banana", "Yellow");
        map.put("apple", "Red");
        map.put("grape", "Purple");
        map.put("kiwi", "Green");
        map.put("blueberry", "Blue");

        System.out.println(map);
    }
}
