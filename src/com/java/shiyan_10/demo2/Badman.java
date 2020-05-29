package com.java.shiyan_10.demo2;

public class Badman implements DogState{
    @Override
    public void showState() {
        System.out.println("Get out of my home or I will bite you :(");
    }
}
