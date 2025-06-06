package basics.Collections.List;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // toString for easy printing
    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + "}";
    }
}
