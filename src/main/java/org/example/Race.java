package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class Race {

    private LinkedList<Vehicle> vehicles;
    private RaceTrack raceTrack;
    public int startTimeRace;
    public int finishTimeRace;
    public int laps;

    HashMap<Vehicle, RaceRegister> registers = new HashMap<Vehicle, RaceRegister>();

    public Race(LinkedList<Vehicle> vehicles, RaceTrack raceTrack, int startTimeRace, int laps) {
        this.vehicles = vehicles;
        this.raceTrack = raceTrack;
        this.startTimeRace = startTimeRace;
        finishTimeRace = 0;
        this.laps = laps;

        for (int i = 0; i < vehicles.size(); i++) {
            registers.put(vehicles.get(i), new RaceRegister(0.0, 0, false));
            if (vehicles.get(i) instanceof Car) {
                ((Car) vehicles.get(i)).turnEngineOn();
            }
        }
    }

    public void startRace() {
        for (int i = 0; i < vehicles.size(); i++) {
            registers.put(vehicles.get(i), new RaceRegister(0.0, 0, false));
            if (vehicles.get(i) instanceof Car) {
                ((Car) vehicles.get(i)).turnEngineOn();
            }
        }

        while (!raceCompleted()) {
            for (int i = 0; i < vehicles.size(); i++) {
                Vehicle vehicle = vehicles.get(i);
                RaceRegister register = registers.get(vehicle);
                if (register.getDistance() < raceTrack.distance && register.isCompletedRace() != true) {
                    double newDistance = register.getDistance() + vehicle.accelerate(new Random().nextInt(50));
                    register.setDistance(newDistance);
                } else if (register.getDistance() > raceTrack.distance && register.isCompletedRace() != true) {
                    int newLaps = register.getLaps() + 1;
                    register.setLaps(newLaps);
                    register.setDistance(0.0);

                }
            }
        }
    }

    public boolean raceCompleted() {
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            RaceRegister register = registers.get(vehicle);
            if (register.getLaps() < laps) {
                return false;
            }
            System.out.println(vehicle.getType() + "!! Has won");
            register.setCompletedRace(true);
        }
        return true;

    }

}
