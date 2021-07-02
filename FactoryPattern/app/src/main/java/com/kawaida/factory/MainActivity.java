package com.kawaida.factory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AbstractFactory fillFactory = FactoryGenerator.getFactory("FIL");
        Filling filling = fillFactory.getFilling("HAM");
        Log.d("TAG", filling.name());

        AbstractFactory breadFactory = FactoryGenerator.getFactory("BRE");
        Bread bread = breadFactory.getBread("BAG");
        Log.d("TAG", bread.name());

        Bread bread1 = breadFactory.getBread("ROL");
        Log.d("TAG", bread.name());
    }
}