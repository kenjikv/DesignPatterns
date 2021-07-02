package com.kawaida.singletonandprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Singleton singleton = Singleton.getInstance("Value 1");
//        Singleton singleton2 = Singleton.getInstance("Value 2");
//
//        Log.d(TAG, singleton.value);
//        Log.d(TAG, singleton2.value);

        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        //parametros de shape
        circle.x = 10;
        circle.y = 10;
        circle.color = "red";
        //parametros de circle
        circle.radius = 15;
        shapes.add(circle);

        Circle anotherCicle = (Circle) circle.clone();
        shapes.add(circle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 10;
        rectangle.color = "blue";
        shapes.add(rectangle);

        /**
         * shapes [circle, circle, rectangle]
         */

        cloneAndCompare(shapes, shapesCopy);

    }

    /**
     * shapesCopy [circle, circle, rectangle]
     */
    private void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {

        for (Shape shape: shapes){
            Shape aux = shape.clone();
            aux.color = "verde";
            shapesCopy.add(aux);
        }

        for (int i = 0; i < shapes.size(); i++){

            //verificamos si los dos objetos son iguales
            if(shapes.get(i) == shapesCopy.get(i)){
                Log.d(TAG, i + ": Shapes son iguales");
            }else{
                Log.d(TAG, i + ": Shapes no son iguales");
                //verificar si tiene los mismos valores
                if(shapes.get(i).equals(shapesCopy.get(i))){
                    Log.d(TAG, i + ": Sus valores son identicos pero son distintos objetos");
                }else {
                    Log.d(TAG, i + ": Sus valores no son identicos y son distintos objetos");
                }
            }
        }

    }
}