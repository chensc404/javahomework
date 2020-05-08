package com.java.shiyan_08.demo2;

public abstract class Shape {
    private static int ID;
    public abstract double getArea();

    public Shape() {
    }

    public static int getID(){
        return ID;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
