package com.kawaida.factory;

public class SandwichBuilder {

    public static Sandwich cheeseAndHam(){
        Sandwich s = new Sandwich();

        s.addIngredient(new Sliced());
        s.addIngredient(new Ham());
        s.addIngredient(new Cheese());

        return s;
    }

    public static Sandwich cheeseAndHamAndTomato(){
        Sandwich s = new Sandwich();

        s.addIngredient(new Sliced());
        s.addIngredient(new Ham());
        s.addIngredient(new Cheese());
        s.addIngredient(new Tomato());

        return s;
    }

    public static Sandwich build(Sandwich s, Ingredient i){
        s.addIngredient(i);
        return s;
    }

}
