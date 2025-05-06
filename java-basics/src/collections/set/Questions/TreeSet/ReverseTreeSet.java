package collections.set.Questions.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class ReverseTreeSet {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("orange");
        set.add("apple");
        set.add("banana");
        set.add("kiwi");

        Iterator<String> it = set.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
