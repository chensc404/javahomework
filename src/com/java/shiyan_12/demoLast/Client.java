package com.java.shiyan_12.demoLast;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws NegativeException {
        Scanner in = new Scanner(System.in);
        int count;
        System.out.println("这颗苹果树上有几个苹果？");
        count = in.nextInt();
        if(count < 0){
            throw new NegativeException();
        }else {
            System.out.println("的确有" + count + "个苹果");
        }
    }
}
