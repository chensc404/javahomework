package com.java.shiyan_08.demo2;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(3,4,10.0);
        Circle.setID(111);
        System.out.println(c.toString());
        System.out.println("Cicle的ID是:  " + Circle.getID());

        System.out.println();

        Cylinder cl = new Cylinder(4,6,9,12);
        Cylinder.setID(222);
        System.out.println(cl.toString());
        System.out.println("cl的体积是： " + cl.getVolume());
        System.out.println("Cylinder的ID是：  " + Cylinder.getID());
    }
}
