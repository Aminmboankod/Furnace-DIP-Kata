package edu.craptocraft;

import edu.craptocraft.domain.Heater;
import edu.craptocraft.domain.Regulate;
import edu.craptocraft.domain.Thermometer;
import edu.craptocraft.furnace.Furnace;
import edu.craptocraft.props.GasHeater;
import edu.craptocraft.props.Regulator;
import edu.craptocraft.props.RemoteCommandSensor;

public class App {
    public static void main(String[] args) {

        final double minTemp = 20d;
        final double maxTemp = 250d;

        Furnace oldEven = new Furnace(110d);
        Heater heater = new GasHeater();
        Thermometer thermometer = new RemoteCommandSensor();

        Regulate regulator = new Regulator();

        System.out.println("Arrancando...");
        regulator.regulate(thermometer, heater, minTemp, maxTemp);

    }
}
