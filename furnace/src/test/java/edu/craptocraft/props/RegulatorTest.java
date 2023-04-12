package edu.craptocraft.props;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.domain.Heater;
import edu.craptocraft.domain.Thermometer;
import edu.craptocraft.furnace.RoomTemperature;

public class RegulatorTest {

    public static Regulator regulator;
    public static RoomTemperature temperature;
    public static Heater heater;
    public static Thermometer thermometer;

    @BeforeClass
    public static void createRegulator() {
        temperature = RoomTemperature.getInstance();
        heater = new GasHeater();
        thermometer = new RemoteCommandSensor();
        regulator = new Regulator(80.0, 220.0);
    }

    @Test
    public void testRegulateEngage() {

    }

    @Test
    public void testRegulateDisengage() {

    }
}
