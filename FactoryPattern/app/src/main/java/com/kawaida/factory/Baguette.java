package com.kawaida.factory;

public class Baguette implements Bread{
    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public String calories() {
        return " : 100 kcal";
    }

}
