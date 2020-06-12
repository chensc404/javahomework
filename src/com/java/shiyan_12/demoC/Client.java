package com.java.shiyan_12.demoC;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws NumberFormatException{
        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("请输入数字(0 - 9)：");
        number = in.nextInt();
        switch (number){
            case 0:
                System.out.println("零");
                break;
            case 1:
                System.out.println("壹");
                break;
            case 2:
                System.out.println("贰");
                break;
            case 3:
                System.out.println("叁");
                break;
            case 4:
                System.out.println("肆");
                break;
            case 5:
                System.out.println("伍");
                break;
            case 6:
                System.out.println("陆");
                break;
            case 7:
                System.out.println("柒");
                break;
            case 8:
                System.out.println("捌");
                break;
            case 9:
                System.out.println("玖");
                break;
            default:
                throw new NumberFormatException();
        }
    }
}
