package com.java.shiyan_07;

public class Equals {
	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		String c = "def";
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("a与b相等？ " + a.equals(b));
		System.out.println("a与c相等？ " + a.equals(c));
	}
}
