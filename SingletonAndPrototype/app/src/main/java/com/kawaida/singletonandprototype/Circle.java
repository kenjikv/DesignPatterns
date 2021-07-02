package com.kawaida.singletonandprototype;

import androidx.annotation.Nullable;

public class Circle extends Shape{

    public int radius;

    public Circle(){

    }

    public Circle(Circle target){
        super(target);
        if(target != null){
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if(!(obj instanceof Circle)) return false;

        Circle circle2 = (Circle) obj;
        return circle2.radius == radius && circle2.color == color;
    }
}
