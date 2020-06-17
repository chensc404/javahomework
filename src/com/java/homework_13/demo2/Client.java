package com.java.homework_13.demo2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        boolean flag = true;
        while(flag){
            try{
                a = in.nextInt();
                b = in.nextInt();
                System.out.println(a + "+" + b + "=" + (a + b));
                flag = false;
            }catch (InputMismatchException e){
                System.out.println("请输入正确的格式：");
                in.nextLine();
            }
        }
    }
}
