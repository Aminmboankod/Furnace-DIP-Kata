package edu.craptocraft.domain;

public interface Regulate {

    void regulate(Thermometer t, Heater h, double minTemp, double maxTemp);
}
