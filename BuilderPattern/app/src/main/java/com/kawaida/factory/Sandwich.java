package com.kawaida.factory;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {

    private static final String TAG = "Sandwich";
    private List<Ingredient> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void getCalories(){
        int calories = 0;

        //foreach
        for (Ingredient i: ingredients) {
            calories += i.calories();
        }
//        //for index
//        for(int index = 0; index < ingredients.size(); index++){
//            calories += ingredients.get(index).calories();
//        }

        Log.d(TAG, "Total de calorias: " + calories + " kcal");
    }

    public void getIngredients(){
        for (Ingredient i: ingredients) {
            Log.d(TAG, i.name() + " : " + i.calories() + " kcal");
        }
    }

}
