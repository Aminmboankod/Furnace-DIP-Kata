package edu.craptocraft.props;

import edu.craptocraft.domain.Heater;
import edu.craptocraft.furnace.RoomTemperature;

public class GasHeater implements Heater {

    @Override
    public void engage(RoomTemperature temperature) {
        temperature.updateTemperature(1);
    }

    @Override
    public void disangage(RoomTemperature temperature) {
        temperature.updateTemperature(-1);
    }

}
