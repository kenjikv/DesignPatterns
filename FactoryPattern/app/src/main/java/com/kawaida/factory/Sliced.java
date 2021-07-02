package com.kawaida.factory;

public class Sliced implements Bread{

    @Override
    public String name() {
        return "Pan molde";
    }

    @Override
    public String calories() {
        return " : 20 kcal";
    }
}
