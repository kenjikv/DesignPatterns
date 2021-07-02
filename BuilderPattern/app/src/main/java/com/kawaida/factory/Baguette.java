package com.kawaida.factory;

public class Baguette extends Bread{

    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public int calories() {
        return 250;
    }

    @Override
    public String description() {
        return "Un baguette recien hecho y crujiente";
    }

    @Override
    public String image() {
        return "R.drawable.baguette";
    }
}
