package com.kawaida.factory;

public class Cheese implements Filling{
    @Override
    public String name() {
        return "Queso";
    }

    @Override
    public String calories() {
        return " : 20 kcal";
    }
}
