package basics.OOP.Polymorphism.OverLoading;

interface Animal {
    void eat();
    void eat(String food);
    void eat(String food, int quantity);
    void move();
}

abstract class AbstractCat implements Animal {
    abstract void move(int distance);
}

public class Main extends AbstractCat{
    @Override
    void move(int distance) {

    }

    @Override
    public void eat() {

    }

    @Override
    public void eat(String food) {

    }

    @Override
    public void eat(String food, int quantity) {

    }

    @Override
    public void move() {

    }
}
