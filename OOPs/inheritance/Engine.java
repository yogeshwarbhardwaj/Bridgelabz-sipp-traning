// Engine class
public class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
    
    public void stop() {
        System.out.println("Engine stopped.");
    }
}

// Car class using composition
public class Car {
    private Engine engine;  // Car "has-an" Engine

    public Car() {
        this.engine = new Engine(); // Composition
    }

    public void startCar() {
        engine.start();
        System.out.println("Car is running.");
    }

    public void stopCar() {
        engine.stop();
        System.out.println("Car has stopped.");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startCar();
        myCar.stopCar();
    }
}