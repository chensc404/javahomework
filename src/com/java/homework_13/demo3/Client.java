package com.java.homework_13.demo3;

public class Client {
    public static void main(String[] args) {
        try{
            System.out.println("START");
            throw  new MyException("EXception appear！");
        }catch (MyException e){
            e.PRINT();
        }
    }
}
