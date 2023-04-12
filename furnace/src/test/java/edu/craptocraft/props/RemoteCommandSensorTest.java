package edu.craptocraft.props;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.furnace.RoomTemperature;

public class RemoteCommandSensorTest {
    @Test
    public void testRead() {
        RoomTemperature temp = RoomTemperature.getInstance();
        temp.setTemperature(20.5);
        RemoteCommandSensor sensor = new RemoteCommandSensor();
        assertEquals(20.5, sensor.read(temp), 0.001);

        temp.setTemperature(25.0);
        assertEquals(25.0, sensor.read(temp), 0.001);

        temp.setTemperature(30.0);
        assertEquals(30.0, sensor.read(temp), 0.001);
    }
}
