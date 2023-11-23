package org.example;

public class Bus extends Vehicle {

    private int peopleQuantity;
    private String engineType;
    boolean isBroke;
    boolean engineOn;



    public Bus(String engineType) {
        super(4, 16, 6, true, 8, "Bus");
        peopleQuantity=0;
        this.engineType=engineType;
        isBroke=false;
        engineOn=false;
    }

    public void printVehicleAttributes(){
        System.out.println("Doors: "+ getDoors());
        System.out.println("Seats: "+ getSeats());
        System.out.println("Wheels: "+ getWheels());
        System.out.println("hasEngine" +isEngineOn());
        System.out.println("Windows: "+ getWindows());
        System.out.println("Type: " + getType());
        System.out.println("People Quantity: "+peopleQuantity);
        System.out.println("Engine Type: " +engineType);
    }

    public void turnEngineOn(){
        if(isBroke){
            System.out.println("The "+getType()+" can't be Turn On, cus the "+getType()+" is crashed");
        }else{
            this.engineOn=true;
            System.out.println("The engine is On");
        }
    }

    public void turnEngineOff(){
        this.engineOn=false;
        System.out.println("The "+getType()+" is off");
    }

    @Override
    public double accelerate(int speedIncrement) {
        System.out.println("The " +getType()+"is accelerating");
        return 5*speedIncrement;
    }
}
