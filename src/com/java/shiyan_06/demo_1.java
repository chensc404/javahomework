package com.java.shiyan_06;
import java.util.Arrays;
import java.util.Random;
public class demo_1 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = r.nextInt(100);
		}
		System.out.println(Arrays.toString(nums));
	}
}
