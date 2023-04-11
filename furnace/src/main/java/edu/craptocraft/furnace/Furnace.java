package edu.craptocraft.furnace;

public class Furnace {

    private double currentTemp = 0d;

    public Furnace(double currentTemp) {
        this.currentTemp = currentTemp;
    }

    public double getCurrentTemperature() {
        return currentTemp;
    }

    public void setCurrentTemperature(double currentTemp) {
        this.currentTemp = currentTemp;
    }

}
