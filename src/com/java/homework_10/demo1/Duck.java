package com.java.homework_10.demo1;

public class Duck implements Flyable,Swimmable {

    @Override
    public void fly() {
        System.out.println("I can fly~");
    }

    @Override
    public void swim() {
        System.out.println("I can swim~");
    }
}
