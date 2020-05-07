package com.java.homework_04;

public class TestStock {
	public static void main(String[] args) {
		Stock s1 = new Stock("600000","浦发银行");
		s1.setPreviousPrice(25.50);
		s1.setCurrentPrice(28.6);
		System.out.println(s1.getName());
		System.out.println(s1.getSymbol());
		System.out.printf("%.2f",s1.getChangePercent());
	}
}
