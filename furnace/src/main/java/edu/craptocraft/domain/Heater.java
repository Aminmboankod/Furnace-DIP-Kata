package edu.craptocraft.domain;

import edu.craptocraft.furnace.RoomTemperature;

public interface Heater {

    void engage(RoomTemperature temperature);

    void disangage(RoomTemperature temperature);
}
