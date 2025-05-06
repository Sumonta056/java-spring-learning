package ExtraTopics.Generics;

class Box<T>{
    private T value;
    public Box(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(123);
        Box<String> strBox = new Box<>("Hello");

        System.out.println("Integer Box: " + intBox.getValue());
        System.out.println("String Box: " + strBox.getValue());
    }
}
