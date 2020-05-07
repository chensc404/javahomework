package com.java.shiyan_06;
import java.util.Arrays;
import java.util.Random;
public class demo_2 {
	public static void main(String[] args) {
		//生成随机数
		Random r = new Random();
		int[][] nums1 = new int[4][5];
		//初始化数组nums1
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				nums1[i][j] = r.nextInt(100);
			}
		}
		//遍历输出
		for (int[] t:nums1) {
				System.out.println(Arrays.toString(t));
		}
		System.out.println("-----------------------");
		int[][] nums2 = new int[4][];
		for (int i = 0; i < 4; i++) {
			//此处3是我要创建的第二维length递增初始值
			nums2[i] = new int[i + 3];
			for (int j = 0; j < i+3; j++) {
				nums2[i][j] = r.nextInt(100);
			}
		}
		for (int[] t:nums2) {
			System.out.println(Arrays.toString(t));
		}
	}
}
