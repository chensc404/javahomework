package com.java.shiyan_10.demo2;

public class Dog {
    DogState state;
    public void cry(){
        state.showState();
    }

    public void setState(DogState state) {
        this.state = state;
    }
}
