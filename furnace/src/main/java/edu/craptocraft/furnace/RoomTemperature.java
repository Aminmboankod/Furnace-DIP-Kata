package edu.craptocraft.furnace;

public class RoomTemperature {

    private static RoomTemperature temperature = null;
    private double currentTemperature;

    public static RoomTemperature getInstance() {
        if (temperature == null) {

            temperature = new RoomTemperature();
        }

        return temperature;
    }

    public double getTemperature() {
        return currentTemperature;
    }

    public void setTemperature(double temperature) {

        this.currentTemperature = temperature;
    }

    // método necesario para engage y disengage en GasHeater
    public void updateTemperature(double increment) {

        setTemperature(getTemperature() + increment);
    }

    @Override
    public String toString() {
        return "Temperatura actual: " + getTemperature();
    }

}
