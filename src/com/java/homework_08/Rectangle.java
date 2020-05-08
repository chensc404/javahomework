package com.java.homework_08;

public class Rectangle extends Shape {
    private double length;
    private double height;

    public Rectangle(String name, double length, double height) {
        super(name);
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString() +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}
