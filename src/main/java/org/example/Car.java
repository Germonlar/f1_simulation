package org.example;

import java.util.Random;

public class Car extends Vehicle{
    String color;
    String model;
    int year;
    int powerHorse;
    boolean engineOn;
    boolean brokenCar;
    String licensePlate;
    int mileage;
    int price;
    int speed;


    public Car(String color,String model,int powerHorse , int year, String licensePlate, int mileage, int price){
        super(5,5,4,true,4,"Car");
        this.color=color;
        this.model=model;
        this.powerHorse=powerHorse;
        this.year=year;
        engineOn=false;
        brokenCar=false;
        this.licensePlate=licensePlate;
        this.mileage=mileage;
        this.price=price;
        this.speed=0;
    }



    public void turnEngineOn(){
        if(brokenCar){
            System.out.println("The car can't be Turn On, cus the car is crashed");
        }else{
            this.engineOn=true;
            System.out.println("The engine is On");
        }
    }

    public void turnEngineOff(){
        this.engineOn=false;
        System.out.println("The car is off");
    }

    public double accelerate(int speedIncrement){
        Random ran = new Random();
        if(engineOn){
            if(ran.nextInt(2)==100){
                System.out.println("The car has crashed");
                brokenCar=true;
                engineOn=false;
            }else{
                this.speed +=speedIncrement;
                System.out.println("The actual speed of the car is"+ this.speed);
            }
        }else{
            System.out.println("Unable to accelerate, the engine is off");
        }
        return 10*speedIncrement;
    }

    public void brake(double speedReduction) {
        if(engineOn){
            this.speed -= speedReduction;
            if (this.speed < 0) {
                this.speed = 0;
                System.out.println("The car has stop");
            }
        }
    }

    public void turnLeft(){
        if(this.engineOn && this.speed>0){
            System.out.println("The car is turning Left");
        }else{
            System.out.println("The car cannot turn left");
        }
    }

    public void repair(){
        if(brokenCar){
            System.out.println("The car has been fixed");
            brokenCar=false;
        }else{
            System.out.println("The car doesn't need to be repair");
        }
    }

    public void printVehicleAttributes(){
        System.out.println("Color: "+ color);
        System.out.println("Model: "+ model);
        System.out.println("Year: "+ year);
        System.out.println("PowerHorse: "+ powerHorse );
        System.out.println("License Plate: "+ licensePlate);
        System.out.println("Mileage: "+ mileage);
        System.out.println("Price: "+ price);
        System.out.println("speed: "+ speed);
        System.out.println("Engine On: "+ engineOn);
        System.out.println("Is broken: "+ brokenCar);
        System.out.println("Doors: "+ getDoors());
        System.out.println("Seats: "+getSeats());
        System.out.println("hasEngine: "+ isHasEngine());
        System.out.println("Windows: "+getWindows());
        System.out.println("Type: " + getType());
    }







}
