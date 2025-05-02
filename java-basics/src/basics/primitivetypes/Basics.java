package basics.primitivetypes;

public class Basics {
    public static void main(String[] args) {
        // Primitive Types
        byte b = 127; // -128 to 127
        short s = 32767; // 2 bytes
        int i = 2147483647; // 4 bytes
        long l = 9223372036854775807L; // 8 bytes
        float f = 3.40282347E38F; // 4 bytes
        double d = 1.7976931348623157E308; // 8 bytes
        char c = 'A'; // 2 bytes
        boolean bool = true; // 1 bit

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        int a = 1;
        System.out.println(a);

        char var = 14;
        System.out.println(var);

        int i2 = Integer.MAX_VALUE;
        int j = i2 + 1;
        System.out.println(j);
    }
    
}
