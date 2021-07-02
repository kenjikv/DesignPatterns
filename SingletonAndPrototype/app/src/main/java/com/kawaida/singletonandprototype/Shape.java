package com.kawaida.singletonandprototype;

import java.util.Objects;

import androidx.annotation.Nullable;

public abstract class Shape {

    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target){
        this.x = target.x;
        this.y = target.y;
        this.color = target.color;
    }

    public abstract Shape clone();

    @Override
    public boolean equals(@Nullable Object obj) {
        if(!(obj instanceof Shape)) return false;

        Shape shape2 = (Shape)obj;
//        boolean result = false;
//        if(shape2.x == x){
//            result = true;
//        }else{
//            result = false;
//        }
//
//        if(shape2.y == y){
//            result = true;
//        }else{
//            result = false;
//        }
//
//        if(shape2.color == color){
//            result = true;
//        }else{
//            result = false;
//        }
//
//        return result;

        return shape2.x == x && shape2.y == y && shape2.color.equalsIgnoreCase(color);
    }
}
