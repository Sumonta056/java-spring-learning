package String;

public class StringBuilderClass {
    public static void main(String[] args) {
        String name = "John";
        name.toLowerCase(); // This does not change the original string
        System.out.println(name); // Output: John

        StringBuilder nameBuilder = new StringBuilder("John");
        nameBuilder.append(" Doe"); // This modifies the original StringBuilder object
        System.out.println(nameBuilder); // Output: John Doe
    }}
