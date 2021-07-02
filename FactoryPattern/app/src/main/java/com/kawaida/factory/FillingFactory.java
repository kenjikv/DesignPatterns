package com.kawaida.factory;

public class FillingFactory extends AbstractFactory{
    @Override
    Bread getBread(String breadType) {
        return null;
    }

    @Override
    Filling getFilling(String fillingType) {
        if(fillingType == "HAM"){
            return new Ham();
        }else if (fillingType == "TOM"){
            return new Tomato();
        }else if(fillingType == "CHE"){
            return new Cheese();
        }

        return null;
    }

    @Override
    Drink getDrink(String drinkType) {
        return null;
    }
}
