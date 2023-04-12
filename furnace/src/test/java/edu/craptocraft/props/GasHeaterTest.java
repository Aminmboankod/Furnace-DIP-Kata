package edu.craptocraft.props;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.furnace.RoomTemperature;

public class GasHeaterTest {
    @Test
    public void testDisangage() {

        RoomTemperature temp = RoomTemperature.getInstance();
        double initialTemp = temp.getTemperature();
        GasHeater gasHeater = new GasHeater();
        gasHeater.engage(temp);
        assertEquals(initialTemp + 1, temp.getTemperature(), 0.001);
    }

    @Test
    public void testEngage() {
        RoomTemperature temp = RoomTemperature.getInstance();
        double initialTemp = temp.getTemperature();
        GasHeater gasHeater = new GasHeater();
        gasHeater.engage(temp);
        assertEquals(initialTemp + 1, temp.getTemperature(), 0.001);

    }
}
