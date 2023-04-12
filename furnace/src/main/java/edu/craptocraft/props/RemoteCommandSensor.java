package edu.craptocraft.props;

import edu.craptocraft.domain.Thermometer;
import edu.craptocraft.furnace.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {

    @Override
    public double read(RoomTemperature temperature) {
        return temperature.getTemperature();
    }

}
