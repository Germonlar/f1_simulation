package org.example;

public class QuadBike extends Vehicle {

    public QuadBike() {
        super(0, 1, 4, true, 0, "Quadbike");
    }

    @Override
    public double accelerate(int speedIncrement) {
        System.out.println("Quadbike is speeding up");
        return 15*speedIncrement;
    }
}
