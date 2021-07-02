package com.kawaida.patronesestructurales;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kawaida.patronesestructurales.adapter.RoundHole;
import com.kawaida.patronesestructurales.adapter.RoundPeg;
import com.kawaida.patronesestructurales.adapter.SquarePeg;
import com.kawaida.patronesestructurales.adapter.SquarePegAdapter;
import com.kawaida.patronesestructurales.bridge.AdvancedRemote;
import com.kawaida.patronesestructurales.bridge.BasicRemote;
import com.kawaida.patronesestructurales.bridge.Radio;
import com.kawaida.patronesestructurales.bridge.Tv;
import com.kawaida.patronesestructurales.proxy.ServiceMessage;
import com.kawaida.patronesestructurales.proxy.ServiceMessageImpl;
import com.kawaida.patronesestructurales.proxy.ServiceMessageImpl2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //adapter
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if(hole.fits(rpeg)){
            System.out.println("Round peg con radio 5 calza con el Round hole con radio 5");
        }else{
            System.out.println("Round peg con radio 5 no calza con el Round hole con radio 5");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg bigSqPeg = new SquarePeg(20);
//        hole.fits(smallSqPeg);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter bigSqPegAdapter = new SquarePegAdapter(bigSqPeg);

        if(hole.fits(smallSqPegAdapter)){
            System.out.println("Square peg con width 2 calza con el Round hole con radio 5");
        }

        if(!hole.fits(bigSqPegAdapter)){
            System.out.println("Square peg con width 20 no calza con el Round hole con radio 5");
        }

        //Bridge
        System.out.println("Test Basic Remote");
        Tv tv = new Tv();
        BasicRemote basicRemote = new BasicRemote(tv);
        basicRemote.power();
        tv.printStatus();

        System.out.println("Test Advance Remote");
        Radio radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.power();
        advancedRemote.mute();
        radio.printStatus();


        //Proxy
        ServiceMessage sm = new ServiceMessageImpl();
        System.out.println(sm.message("Kenji"));

        sm = new ServiceMessageImpl2();
        System.out.println(sm.message("Kenji"));
    }
}