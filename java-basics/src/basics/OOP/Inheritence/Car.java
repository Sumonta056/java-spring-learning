package basics.OOP.Inheritence;

interface Moveable {
    public void start();

    public void stop();

    public void move();
}

// Must implement all methods of the interface
class Bike implements Moveable{

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void move() {

    }
}

// No need to implement all methods of the interface
abstract class Vehicle implements Moveable {
    public void start() {
        System.out.print("Starting...");
    }

    public void stop() {
        System.out.print("Stopping...");
    }
}

public class Car extends Vehicle{
    @Override
    public void move() {

    }
}

class Truck extends Vehicle{
    @Override
    public void move() {

    }
}
