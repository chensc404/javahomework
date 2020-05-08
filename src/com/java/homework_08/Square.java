package com.java.homework_08;

public class Square extends Shape{
    private double length;

    public Square(String name, double length) {
        super(name);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString() +
                ", length=" + length +
                '}';
    }
}
