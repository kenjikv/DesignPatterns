package com.kawaida.patronesestructurales.bridge;

public class Tv implements Device{

    private boolean on = false;
    private int volumen = 30;
    private int channel = 1;

    @Override
    public boolean isEnable() {
        return on;
    }

    @Override
    public void enable() {
        this.on = true;
    }

    @Override
    public void disable() {
        this.on = false;
    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    @Override
    public void setVolumen(int percent) {
        this.volumen = volumen;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("-----------------------------------");
        System.out.println("| Esta es la configuracion de la TV");
        System.out.println("| La tv esta " + (on ? "encendida" : "apagada"));
        System.out.println("| Volumen esta en: " + volumen);
        System.out.println("| Channel esta en: " + channel);
        System.out.println("-----------------------------------");
    }
}
