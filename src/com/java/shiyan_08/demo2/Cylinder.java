package com.java.shiyan_08.demo2;

public class Cylinder extends Circle{
    private double height;
    private static int ID;

    public Cylinder(double centerX, double centerY, double radius, double height) {
        super(centerX, centerY, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Cylinder.ID = ID;
    }

    public double getVolume(){
        return Math.PI * getRadius() * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                ", height=" + height +
                '}';
    }
}
