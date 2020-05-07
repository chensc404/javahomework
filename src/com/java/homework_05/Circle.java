package com.java.homework_05;

public class Circle {
	public static void main(String[] args) {
		System.out.println(cir(12,5));
	}

	public static int cir(int n,int m){
			int p = 0;
			for(int i = 2;i <= n;i++)
			{
				p = (p + m) % i;
			}
			return p + 1;
	}
}
