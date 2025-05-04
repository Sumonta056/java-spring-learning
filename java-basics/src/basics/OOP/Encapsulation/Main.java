package basics.OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Mary", 20);
        System.out.println(person.getInfo());
        person.setAge(25);
        System.out.println(person.getInfo());
        person.setAge(-5); // Invalid age
        System.out.println(person.getInfo());
    }
}
