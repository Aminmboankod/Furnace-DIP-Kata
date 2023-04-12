package edu.craptocraft.props;

import static org.junit.Assert.assertEquals;

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

        temperature.setTemperature(221.0);
        assertEquals(221.0, temperature.getTemperature(), 0);
        regulator.regulate(thermometer, heater, temperature);
        assertEquals(220.0, temperature.getTemperature(), 0);
    }

    @Test
    public void testRegulateDisengage() {
        temperature.setTemperature(50.0);
        assertEquals(50.0, temperature.getTemperature(), 0);
        regulator.regulate(thermometer, heater, temperature);
        assertEquals(80.0, temperature.getTemperature(), 0);
    }
}
