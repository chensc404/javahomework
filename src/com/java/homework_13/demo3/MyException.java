package com.java.homework_13.demo3;

public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }

    public void PRINT(){
        System.out.println(getMessage());
    }
}
