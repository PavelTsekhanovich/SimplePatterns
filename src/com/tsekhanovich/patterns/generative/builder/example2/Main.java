package com.tsekhanovich.patterns.generative.builder.example2;

import com.tsekhanovich.patterns.generative.builder.example2.builders.CarBuilder;
import com.tsekhanovich.patterns.generative.builder.example2.builders.CarManualBuilder;
import com.tsekhanovich.patterns.generative.builder.example2.cars.Car;
import com.tsekhanovich.patterns.generative.builder.example2.cars.Manual;
import com.tsekhanovich.patterns.generative.builder.example2.director.Director;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
