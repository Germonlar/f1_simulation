package org.example;

public class CargoTruck extends Vehicle {

    public CargoTruck() {
        super(3, 2, 16, true, 2, "truck");
    }

    @Override
    public double accelerate(int speedIncrement) {
        System.out.println("Cargo truck is speeding up");
        return 15 * speedIncrement;
    }
}
