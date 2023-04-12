package edu.craptocraft.domain;

import edu.craptocraft.furnace.RoomTemperature;

public interface Thermometer {

    double read(RoomTemperature temperature);
}
