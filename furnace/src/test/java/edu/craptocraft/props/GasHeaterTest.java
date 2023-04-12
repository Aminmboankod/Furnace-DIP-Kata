package edu.craptocraft.props;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.furnace.RoomTemperature;

public class GasHeaterTest {

    public static RoomTemperature temperature;

    @BeforeClass
    public static void createTemperature() {
        temperature = RoomTemperature.getInstance();
    }

    @Test
    public void testDisangage() {

        double initialTemp = temperature.getTemperature();
        GasHeater gasHeater = new GasHeater();
        gasHeater.engage(temperature);
        assertEquals(initialTemp + 1, temperature.getTemperature(), 0.001);
    }

    @Test
    public void testEngage() {

        double initialTemp = temperature.getTemperature();
        GasHeater gasHeater = new GasHeater();
        gasHeater.engage(temperature);
        assertEquals(initialTemp + 1, temperature.getTemperature(), 0.001);

    }
}
