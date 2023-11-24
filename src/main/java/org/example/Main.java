package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Vehicle> vehiclesList = new LinkedList<Vehicle>();

        RaceTrack silverstone = new RaceTrack(1000, 4, "England");
        Bus bus = new Bus("Bus");
        Car car = new Car("Red", "ABCD", 105, 2000, "ABCD", 100, 50);
        Motorcycle motorcycle = new Motorcycle();
        Race race = new Race(vehiclesList, silverstone, 17, 2);
        CargoTruck cargoTruck = new CargoTruck();

        vehiclesList.add(bus);
        vehiclesList.add(car);
        vehiclesList.add(motorcycle);

        race.startRace();

        /*
         * while (true){
         * System.out.println("1: Turn on car");
         * System.out.println("2: Turn off car");
         * System.out.println("3: Repair car");
         * System.out.println("4: Accelarate car");
         * System.out.println("5: Brake car");
         * System.out.println("6: Turn left car");
         * System.out.println("7: Attribute");
         * System.out.println("Select an option: ");
         * 
         * int option = scan.nextInt();
         * 
         * switch(option){
         * case 1:
         * swift.turnEngineOn();
         * break;
         * case 2:
         * swift.turnEngineOff();
         * break;
         * case 3:
         * swift.repair();
         * break;
         * case 4:
         * swift.accelerate(50);
         * break;
         * case 5:
         * swift.brake(50);
         * break;
         * case 6:
         * swift.turnLeft();
         * break;
         * case 7:
         * swift.attributes();
         * break;
         * default:
         * System.out.println("You have to select an available option");
         * }
         * 
         * }
         */

    }

}