package com.tsekhanovich.patterns.structural.bridge.example2.remotes;

import com.tsekhanovich.patterns.structural.bridge.example2.devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}