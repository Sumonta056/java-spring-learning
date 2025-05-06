package String;

public class StringBasics {
    public static void main(String[] args) {
        String str = " Java Programming ";

        System.out.println(str.length());           // 18
        System.out.println(str.trim());             // "Java Programming"
        System.out.println(str.toLowerCase());      // " java programming "
        System.out.println(str.toUpperCase());      // " JAVA PROGRAMMING "
        System.out.println(str.contains("Java"));   // true
        System.out.println(str.replace("Java", "C++")); // " C++ Programming "
        System.out.println(str.substring(1, 5));    // "Java"
        System.out.println(str.charAt(2));          // 'v'

        // Convert Between String and Other Types
        int number = 100;
        String strNum = String.valueOf(number); // "100"
        System.out.println(strNum);

        String s = "123";
        int n = Integer.parseInt(s); // 123
        System.out.println(n);


        // StringBuilder example
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);                     // "Hello World"
        sb.insert(5, ",");
        System.out.println(sb);                     // "Hello, World"
        sb.delete(5, 6);
        System.out.println(sb);                     // "Hello World"
        sb.reverse();
        System.out.println(sb);                     // "dlroW olleH"
        sb.replace(0, 5, "Hi");
        System.out.println(sb);                     // "Hi World"


        // Loop through a String
        String word = "Java";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

    }
}
