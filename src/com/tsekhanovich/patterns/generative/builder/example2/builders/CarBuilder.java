package com.tsekhanovich.patterns.generative.builder.example2.builders;

import com.tsekhanovich.patterns.generative.builder.example2.cars.Car;
import com.tsekhanovich.patterns.generative.builder.example2.cars.Type;
import com.tsekhanovich.patterns.generative.builder.example2.components.Engine;
import com.tsekhanovich.patterns.generative.builder.example2.components.GPSNavigator;
import com.tsekhanovich.patterns.generative.builder.example2.components.Transmission;
import com.tsekhanovich.patterns.generative.builder.example2.components.TripComputer;

public class CarBuilder implements Builder {

    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}