package edu.craptocraft.props;

import java.util.stream.Stream;

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
    public void regulate(Thermometer currentTemperature, Heater h, RoomTemperature temperature) {

        /*
         * creo una secuencia infinita de valores con Stream.iterate
         * lo limito usando .limit()
         * utilizo takeWhile() para detener el flujo
         * cuando llega a la temperatura máxima
         */
        Stream.iterate(currentTemperature.read(temperature), t -> currentTemperature.read(temperature))
                .limit(Long.MAX_VALUE)
                .takeWhile(t -> t > this.getMaxTemp())
                .forEach(t -> temperature.updateTemperature(-1));

        Stream.iterate(currentTemperature.read(temperature), t -> currentTemperature.read(temperature))
                .limit(Long.MAX_VALUE)
                .takeWhile(t -> t < this.getMinTemp())
                .forEach(t -> temperature.updateTemperature(1));
    }

}
