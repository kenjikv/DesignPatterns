package com.kawaida.factory;

public class Roll implements Bread{
    @Override
    public String name() {
        return "Pan roll";
    }

    @Override
    public String calories() {
        return " : 150 kcal";
    }
}
