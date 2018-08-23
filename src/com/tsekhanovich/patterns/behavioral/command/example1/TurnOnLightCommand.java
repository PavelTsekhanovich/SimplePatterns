package com.tsekhanovich.patterns.behavioral.command.example1;

public class TurnOnLightCommand implements Command {

    private Light theLight;

    public TurnOnLightCommand(Light light) {
        this.theLight = light;
    }

    @Override
    public void execute() {
        theLight.turnOn();
    }
}
