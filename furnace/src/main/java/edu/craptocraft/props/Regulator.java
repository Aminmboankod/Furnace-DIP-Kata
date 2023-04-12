package edu.craptocraft.props;

import edu.craptocraft.domain.Heater;
import edu.craptocraft.domain.Regulate;
import edu.craptocraft.domain.Thermometer;
import edu.craptocraft.furnace.RoomTemperature;

public class Regulator implements Regulate {

    protected double minTemp;
    protected double maxTemp;

    public Regulator(double minTemp, double maxTemp) {
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    @Override
    public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, RoomTemperature temperature) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'regulate'");
    }

}
