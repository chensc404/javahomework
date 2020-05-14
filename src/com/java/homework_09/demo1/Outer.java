package com.java.homework_09.demo1;

public class Outer {
    class Inner{

    }

    public Inner makeInnerClass(){
        return new Inner();
    }

    public static void main(String[] args) {
        Inner ic = new Outer().makeInnerClass();
        System.out.println(ic);
    }
}
