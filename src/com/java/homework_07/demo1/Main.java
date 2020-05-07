package com.java.homework_07.demo1;
public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Square s1 = new Square(100);
		Square s2 = (Square)(s1.clone());
		Square s3 = new Square(220);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
