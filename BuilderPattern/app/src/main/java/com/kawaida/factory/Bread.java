package com.kawaida.factory;

public abstract class Bread implements Ingredient{

    @Override
    public abstract String name();

    @Override
    public abstract int calories();

    @Override
    public abstract String description();

    @Override
    public abstract String image();
}
