package edu.craptocraft.domain;

import edu.craptocraft.furnace.RoomTemperature;

public interface Regulate {

    void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, RoomTemperature temperature);
}
