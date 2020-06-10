package com.java.homework_12.demo1;
public class Client {
    public static void main(String[] args) {

        //创建动物笼子
        Cage<Animal> ca = new Cage<>();
        ca.addIN(new Animal());
        ca.addIN(new Bird());
        ca.addIN(new Lion());


        //创建鸟笼子
        Cage<Bird> cb = new Cage<>();
        cb.addIN(new Bird());//true
        //cb.addIN(new Animal());   false


        //创建狮子笼子
        Cage<Lion> cl = new Cage<>();
        cl.addIN(new Lion());//true
        //cl.addIN(new Animal());   false


        System.out.println(ca.toString());
    }
}
