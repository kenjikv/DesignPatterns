package com.kawaida.patronescomportamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kawaida.patronescomportamiento.memento.CareTake;
import com.kawaida.patronescomportamiento.memento.Originator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //memento
        Originator originator = new Originator();
        CareTake careTake = new CareTake();

        originator.setState("Estado 1");
        originator.setState("Estado 2");
        careTake.add(originator.saveStateToMemento());

        originator.setState("Estado 3");
        careTake.add(originator.saveStateToMemento());

        originator.setState("Estado 4");
        careTake.add(originator.saveStateToMemento());

        System.out.println("Estado actual de Originator: " + originator.getState());

        originator.getStateFromMemento(careTake.get(0));
        System.out.println("Primer estado de Originator: " + originator.getState());

        originator.getStateFromMemento(careTake.get(1));
        System.out.println("Segundo estado de Originator: " + originator.getState());

    }
}