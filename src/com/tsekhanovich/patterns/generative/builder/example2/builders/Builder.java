package com.tsekhanovich.patterns.generative.builder.example2.builders;

import com.tsekhanovich.patterns.generative.builder.example2.cars.Type;
import com.tsekhanovich.patterns.generative.builder.example2.components.Engine;
import com.tsekhanovich.patterns.generative.builder.example2.components.GPSNavigator;
import com.tsekhanovich.patterns.generative.builder.example2.components.Transmission;
import com.tsekhanovich.patterns.generative.builder.example2.components.TripComputer;

public interface Builder {

    void setType(Type type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}