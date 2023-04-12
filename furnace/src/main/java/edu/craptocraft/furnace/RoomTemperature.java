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

}
