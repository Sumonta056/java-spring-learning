package basics.OOP.Constructor;

class Parent {
    Parent(int number) {
        System.out.println(number);
    }
}

class Child extends Parent {
    Child() {
        super(2);
    }
}

class Main{
    public static void main(String[] args) {
        Child a = new Child();
    }
}