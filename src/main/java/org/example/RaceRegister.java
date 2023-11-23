package org.example;

public class RaceRegister {

    private double distance;
    private int laps;
    private boolean completedRace;

    public RaceRegister(double distance, int laps, boolean completedRace) {
        this.distance = distance;
        this.laps = laps;
        this.completedRace = completedRace;
    }

    public double getDistance() {
        return distance;
    }

    public int getLaps() {
        return laps;
    }

    public boolean isCompletedRace() {
        return completedRace;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    public void setCompletedRace(boolean completedRace) {
        this.completedRace = completedRace;
    }
}
