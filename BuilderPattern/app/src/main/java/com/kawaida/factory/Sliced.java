package com.kawaida.factory;

public class Sliced extends Bread{

    @Override
    public String name() {
        return "Pan molde";
    }

    @Override
    public int calories() {
        return 80;
    }

    @Override
    public String description() {
        return "Suave y tierno";
    }

    @Override
    public String image() {
        return "R.drawable.sliced";
    }
}
