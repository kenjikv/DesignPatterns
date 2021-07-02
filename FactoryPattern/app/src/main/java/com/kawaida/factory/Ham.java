package com.kawaida.factory;

public class Ham implements Filling{
    @Override
    public String name() {
        return "Jamon";
    }

    @Override
    public String calories() {
        return " : 100 kcal";
    }
}
