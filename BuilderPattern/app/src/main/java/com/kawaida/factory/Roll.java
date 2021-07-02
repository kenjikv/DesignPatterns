package com.kawaida.factory;

public class Roll extends Bread{

    @Override
    public String name() {
        return "Pan de rol";
    }

    @Override
    public int calories() {
        return 168;
    }

    @Override
    public String description() {
        return "Pan de roll recien horneado";
    }

    @Override
    public String image() {
        return "R.drawable.roll";
    }
}
