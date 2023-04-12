package edu.craptocraft.props;

import edu.craptocraft.domain.Heater;
import edu.craptocraft.domain.Regulate;
import edu.craptocraft.domain.Thermometer;
import edu.craptocraft.furnace.RoomTemperature;

public class Regulator implements Regulate {

    @Override
    public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, RoomTemperature temperature) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'regulate'");
    }

}
