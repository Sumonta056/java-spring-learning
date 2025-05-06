package String.Tricks;

public class StingEquals {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        System.out.println(a == b);  // true → same reference from string pool

        String c = new String("Java");
        System.out.println(a == c);  // false → new object in heap

        System.out.println(a.equals(c));  // true → values match

        // ✅ Use equals() to compare content, not ==

    }
}
