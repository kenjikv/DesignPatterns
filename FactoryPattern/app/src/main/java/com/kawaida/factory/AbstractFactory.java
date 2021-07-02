package com.kawaida.factory;

public abstract class AbstractFactory {

    abstract Bread getBread(String breadType);
    abstract Filling getFilling(String fillingType);
    abstract Drink getDrink(String drinkType);

}
