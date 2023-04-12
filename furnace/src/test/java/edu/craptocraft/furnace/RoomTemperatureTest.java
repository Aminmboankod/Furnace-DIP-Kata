package edu.craptocraft.furnace;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

public class RoomTemperatureTest {

    public static RoomTemperature temperature;

    @BeforeClass
    public static void createTemperature() {

        temperature = RoomTemperature.getInstance();
    }

    @Test
    public void testIsInstanced() {
        assertNotNull(temperature);
    }

    @Test
    public void testTemperatureValue() {
        double tempValue = 25.0;
        temperature.setTemperature(tempValue);
        assertEquals(tempValue, temperature.getTemperature(), 0.001);
    }

}