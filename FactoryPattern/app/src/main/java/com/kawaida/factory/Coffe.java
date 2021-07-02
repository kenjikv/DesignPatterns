package com.kawaida.factory;

public class Coffe implements Drink{

    @Override
    public String name() {
        return "Cafe";
    }

    @Override
    public String calories() {
        return " : 10 kcal";
    }
}
