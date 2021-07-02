package com.kawaida.factory;

public class Ham extends Filling{

    @Override
    public String name() {
        return "Jamon";
    }

    @Override
    public int calories() {
        return 200;
    }

    @Override
    public String description() {
        return "Un jamon serrano";
    }

    @Override
    public String image() {
        return "R.drawable.ham";
    }
}
