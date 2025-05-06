package ExecptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception {
    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }
    public static void inputFile(){
        try {
            var reader = new FileReader("input.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) {
//        sayHello(Null);
        inputFile();

    }
}
