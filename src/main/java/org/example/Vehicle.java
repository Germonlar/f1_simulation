package org.example;

import java.util.Random;

public abstract class Vehicle {

    private int doors;
    private int seats;
    private int wheels;
    private boolean hasEngine;
    private int windows;
    private boolean engineOn;
    private boolean brokenVehicle;
    private String type;

    public boolean isEngineOn() {
        return engineOn;
    }

    public boolean isBrokenVehicle() {
        return brokenVehicle;
    }

    public String getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public int getSeats() {
        return seats;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public int getWindows() {
        return windows;
    }

    public Vehicle(int doors, int seats, int wheels, boolean hasEngine, int windows,String type){
        this.doors=doors;
        this.seats=seats;
        this.wheels=wheels;
        this.hasEngine=hasEngine;
        this.windows=windows;
        engineOn=true;
        brokenVehicle=false;
        this.type=type;
    }

    public void turnEngineOn(){
        if(brokenVehicle){
            System.out.println("The " +type+ " can't be Turn On, cus the " +type+ " is crashed");
        }else{
            this.engineOn=true;
            System.out.println("The engine is On");
        }
    }

    public void turnEngineOff(){
        this.engineOn=false;
        System.out.println("The " +type+ " is off");
    }

    public abstract double accelerate(int speedIncrement);

    public void printVehicleAttributes(){
        System.out.println("Doors: "+ getDoors());
        System.out.println("Seats: "+ getSeats());
        System.out.println("Wheels: "+ getWheels());
        System.out.println("hasEngine" +isEngineOn());
        System.out.println("Windows: "+ getWindows());
        System.out.println("Type: " + getType());
    }





}
