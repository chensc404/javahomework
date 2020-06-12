package com.java.shiyan_12.demoB;

import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        try{
            int number = Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.print("请输入格式正确的字符串：");
            str = in.nextLine();
        }finally {
            System.out.println("success");
        }

    }
}
