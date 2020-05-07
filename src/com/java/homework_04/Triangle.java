package com.java.homework_04;
public class Triangle {
	private double a;
	private double b;
	private double c;

	public Triangle(){
		this.a = 0.0;
		this.b = 0.0;
		this.c = 0.0;
	}
	public Triangle(double a,double b,double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double area(){
		double s = (a + b + c)/2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
}
