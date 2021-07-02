package com.kawaida.patronesestructurales.bridge;

public class AdvancedRemote extends BasicRemote{

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute(){
        device.setVolumen(0);
    }

}
