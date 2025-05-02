package basics.primitivetypes;

import java.util.Scanner;

public class InputTaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = scanner.nextLine();
        System.out.println("Hi! " + name );
    }
}
