package com.kawaida.patronesestructurales.bridge;

public class Radio implements Device{

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
        return this.volumen;
    }

    @Override
    public void setVolumen(int percent) {
        this.volumen = percent;
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
        System.out.println("| Esta es la configuracion de la Radio");
        System.out.println("| La Radio esta " + (on ? "encendida" : "apagada"));
        System.out.println("| Volumen esta en: " + volumen);
        System.out.println("| Channel esta en: " + channel);
        System.out.println("-----------------------------------");
    }
}
