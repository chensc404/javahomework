package com.java.shiyan_10.demo2;

public class Client {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println("Owner：");
        d.setState(new Owner());
        d.cry();
        System.out.println("Firend:");
        d.setState(new Friend());
        d.cry();
        System.out.println("Badman:");
        d.setState(new Badman());
        d.cry();
    }
}
