package com.java.shiyan_12.demoLast;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws FingersException {
        Scanner in = new Scanner(System.in);
        int numberOfFinger;
        System.out.print("你有几根手指：");
        numberOfFinger = in.nextInt();
        if(numberOfFinger != 10)
            throw new FingersException();
        else
            System.out.println("你有完美的手指数量！");
    }
}
