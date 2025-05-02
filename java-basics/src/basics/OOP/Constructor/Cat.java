package basics.OOP.Constructor;

public class Cat {
    String color;
    String name;

    Cat() {
        name = "Tom";
        color = "gray";
    }

    Cat(String name) {
        this.name = name;
    }

    Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Miumiu");
        Cat cat3 = new Cat("Kitty", "white");
    }
}
