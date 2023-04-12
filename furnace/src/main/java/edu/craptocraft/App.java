package edu.craptocraft;

import edu.craptocraft.domain.Heater;
import edu.craptocraft.domain.Regulate;
import edu.craptocraft.domain.Thermometer;
import edu.craptocraft.furnace.RoomTemperature;
import edu.craptocraft.props.GasHeater;
import edu.craptocraft.props.Regulator;
import edu.craptocraft.props.RemoteCommandSensor;

public class App {
    public static void main(String[] args) {

        final double minTemp = 20d;
        final double maxTemp = 250d;

        RoomTemperature temperature = RoomTemperature.getInstance();
        temperature.setTemperature(500d);
        System.out.println(temperature.toString());
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();

        Regulate regulator = new Regulator(minTemp, maxTemp);

        System.out.println("\n\nRegulando temperatura...\n\n");
        regulator.regulate(thermometer, heater, temperature);

        System.out.println(regulator.toString());
        System.out.println(temperature.toString());

    }
}
