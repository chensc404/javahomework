package com.java.homework_05;
import java.util.Arrays;
public class Plus {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(sumArray(a,b)));
	}
	public static int[] sumArray(int[] a, int[] b){
		int bound = Math.min(a.length, b.length);
		int [] ans = new int[Math.max(a.length,b.length)];
		for (int i = 0; i < bound; i++) ans[i] = a[i] + b[i];
		System.arraycopy(a.length > b.length ? a : b,bound,ans,bound,Math.abs(a.length - b.length));
		return ans;
	}
}
