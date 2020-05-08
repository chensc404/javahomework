package com.java.shiyan_08.demo2;

public class Circle extends Shape{
    private double centerX;
    private double centerY;
    private double radius;
    private static int ID;

    public Circle(double centerX, double centerY, double radius) {
        super();
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }


    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Circle.ID = ID;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centerX=" + centerX +
                ", centerY=" + centerY +
                ", radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
