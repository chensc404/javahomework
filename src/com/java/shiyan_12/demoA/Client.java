package com.java.shiyan_12.demoA;
//除0.0待完善
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A;int B;
        int ans = 0;
        System.out.print("请输入被除数A:");
        A = in.nextInt();
        System.out.print("请输入除数B:");
        B = in.nextInt();
        try{
            ans = A / B;
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
            System.out.print("请重新输入除数：");
            B = in.nextInt();
        }finally {
            ans = A / B;
            System.out.println(A + "/" + B + "="+ ans);
        }
    }
}
