package com.java.homework_05;
import java.util.Arrays;
public class Sort {
	public static void main(String[] args) {
		int[] a = {2,312,3,1,3,5,6,7,53,4,3};
		seletSort(a);
		System.out.println(Arrays.toString(a));

	}

	private static void seletSort(int[] a) {
		int length = a.length;
		int temp = 0;
		int minIndex;
		for (int j = 0; j <length- 1;j++) {
			minIndex = j;
			for (int i = j; i < length- 1; i++) {
				if (a[minIndex] < a[i + 1]) {
					minIndex = i+1;
				}
			}
			temp = a[minIndex];
			a[minIndex] = a[j];
			a[j] = temp;
		}
	}
}
