package com.kawaida.patronesestructurales.bridge;

public interface Device {
    boolean isEnable();
    void enable();
    void disable();
    int getVolumen();
    void setVolumen(int percent);
    int getChannel();
    void setChannel(int channel);
    void printStatus();
}
