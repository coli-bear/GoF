package com.colibear.behavior.command._02;

import com.colibear.behavior.command._01.Light;

public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();;
    }
}
