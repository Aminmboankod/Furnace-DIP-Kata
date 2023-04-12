package edu.craptocraft.furnace;

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
    public void isInstancedTest() {
        assertNotNull(temperature);
    }

}