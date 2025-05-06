package String;

public class Main {
    public static void main(String[] args) {
        /*
        ?Internally: String is a class, not a primitive.
        ?Strings are immutable → once created, it cannot be changed.
         */
        String str = "Hello World";
        System.out.println("String: " + str);
        str = "Hello Java";
        System.out.println(str);
        /*
        * Immutability in Action: The line str = "Hello Java"; does not change the content of the original "Hello World" string. Instead, it creates a new String object ("Hello Java") and updates the str reference to point to it.
        ! No Modification: The "Hello World" string remains unchanged in memory. Immutability ensures that once a String object is created, its content (the sequence of characters) cannot be altered.
         */

    }
}
