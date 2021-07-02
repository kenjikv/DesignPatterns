package com.kawaida.patronesestructurales.adapter;

public class SquarePeg {

    private double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getSquare(){
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
