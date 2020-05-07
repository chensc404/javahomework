package com.java.homework_07.demo1;

public class Square implements Cloneable{
	private double length;

	public Square(double length) {
		this.length = length;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		return this.length == ((Square)obj).length;
	}

	@Override
	public String toString() {
		return "Square[length=" + this.length + "]";
	}
}
