package com.kawaida.patronesestructurales.bridge;

public class BasicRemote implements Remote{

    protected Device device;

    public BasicRemote() {
    }

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if(device.isEnable()){
            device.disable();
        }else{
            device.enable();
        }
    }

    @Override
    public void volumenDown() {
        device.setVolumen(device.getVolumen() - 10);
    }

    @Override
    public void volumenUp() {
        device.setVolumen(device.getVolumen() + 10);
    }

    @Override
    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }
}
