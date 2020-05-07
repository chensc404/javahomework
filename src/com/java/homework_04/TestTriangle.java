package com.java.homework_04;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.setA(6.0);
		t1.setB(8.0);
		t1.setC(10.0);
		System.out.println("area=" + t1.area());
		Triangle t2 = new Triangle(3.0,4.0,5.0);
		System.out.println("a=" + t2.getA() + " b=" + t2.getB() + " c=" + t2.getC());
		System.out.println("area=" + t2.area());
	}
}
