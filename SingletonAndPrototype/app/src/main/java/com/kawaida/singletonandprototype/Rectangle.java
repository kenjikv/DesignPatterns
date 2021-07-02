package com.kawaida.singletonandprototype;

import androidx.annotation.Nullable;

public class Rectangle extends Shape{

    public int width;
    public int height;

    public Rectangle(){
    }

    public Rectangle(Rectangle target){
        super(target);
        if(target != null){
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if(!(obj instanceof Rectangle)) return false;
        Rectangle rectangle2 = (Rectangle) obj;
        return  rectangle2.width == width && rectangle2.height == height && rectangle2.color == color;
    }
}
