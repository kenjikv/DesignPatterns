package com.kawaida.factory;

public class BreadFactory extends AbstractFactory{

    public Bread getBread(String breadType) {

        if (breadType == "BAG") {
            return new Baguette();
        } else if (breadType == "ROL") {
            return new Roll();
        } else if (breadType == "SLI") {
            return new Sliced();
        }

        return null;
    }

    @Override
    Filling getFilling(String fillingType) {
        return null;
    }

    @Override
    Drink getDrink(String drinkType) {
        return null;
    }
}
