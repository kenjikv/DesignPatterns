package com.kawaida.factory;

public class Cheese extends Filling{
    @Override
    public String name() {
        return "Queso";
    }

    @Override
    public int calories() {
        return 20;
    }

    @Override
    public String description() {
        return "Queso ricota";
    }

    @Override
    public String image() {
        return "R.drawable.cheese";
    }
}
