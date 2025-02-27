class Vehicle {
    public void start() {
        System.out.println("Vehicle starting...");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starting...");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start(); // Calls the start() method of Vehicle class
        
        Car car = new Car();
        car.start(); // Calls the overridden start() method of Car
    }
}