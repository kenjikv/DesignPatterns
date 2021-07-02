package com.kawaida.factory;

public class Coke implements Drink{
    @Override
    public String name() {
        return "Coca cola";
    }

    @Override
    public String calories() {
        return " : 150 kcal";
    }
}
