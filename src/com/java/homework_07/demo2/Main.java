package com.java.homework_07.demo2;

import java.text.DecimalFormat;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random r = new Random();
		int[] a = new int[1000];
		int[] sign = new int[7];
		for (int i = 0; i < a.length; i++) {
			a[i] = (r.nextInt(6) + 1);
		}
		for (int i = 0; i < a.length; i++) {
			sign[a[i]]++;
		}

		for (int t:a
		) {
			System.out.print(t+" ");
		}
		DecimalFormat df = new DecimalFormat();
		df.setMinimumFractionDigits(2);
		df.setMaximumFractionDigits(2);
		System.out.println();
		System.out.println("1的概率: " +  df.format(sign[1] * 100 / 1000.0) + "%");
		System.out.println("2的概率: " +  df.format(sign[2] * 100 / 1000.0) + "%");
		System.out.println("3的概率: " +  df.format(sign[3] * 100 / 1000.0) + "%");
		System.out.println("4的概率: " +  df.format(sign[4] * 100 / 1000.0) + "%");
		System.out.println("5的概率: " +  df.format(sign[5] * 100 / 1000.0) + "%");
		System.out.println("6的概率: " +  df.format(sign[6] * 100 / 1000.0) + "%");
	}
}
