package com.kawaida.factory;

public class DrinkFactory extends AbstractFactory{
    @Override
    Bread getBread(String breadType) {
        return null;
    }

    @Override
    Filling getFilling(String fillingType) {
        return null;
    }

    @Override
    Drink getDrink(String drinkType) {
        if(drinkType == "COK"){
            return new Coke();
        }else if (drinkType == "BEE"){
            return new Beer();
        }else if (drinkType == "COF"){
            return new Coffe();
        }
        return null;
    }
}
