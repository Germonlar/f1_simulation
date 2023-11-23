package org.example;

public class Motorcycle extends Vehicle {


    public Motorcycle(){
        super(4,4,5,true,0,"MotorCycle");

    }

    @Override
    public double accelerate(int speedIncrement) {
        System.out.println("Motorcycle is speeding up");
        return 15*speedIncrement;
    }

}
