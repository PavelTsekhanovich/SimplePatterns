package com.tsekhanovich.patterns.behavioral.command.example1;

public class TurnOffLightCommand implements Command {

    private Light theLight;

    public TurnOffLightCommand(Light light) {
        this.theLight = light;
    }

    @Override
    public void execute() {
        theLight.turnOff();
    }
}
