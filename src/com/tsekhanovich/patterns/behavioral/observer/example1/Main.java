package com.tsekhanovich.patterns.behavioral.observer.example1;

/**
 * @author Pavel Tsekhanovich 24.08.2018
 * <p>
 * Observer
 * <p>
 * + Publisher does not depend on specific subscriber classes.
 * + You can sign and unsubscribe recipients on the fly
 * realizes the principle of openness / closure.
 * <p>
 * - Observers are notified in a random order.
 * - The publisher's subscription code can only be inherited, so it's hard to
 * integrate into an existing class tree.
 */

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(29f, 65f, 745);
        weatherData.setMeasurements(39f, 70f, 760);
        weatherData.setMeasurements(42f, 72f, 763);
    }
}
