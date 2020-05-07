package com.java.shiyan_06;
import java.util.Arrays;
import java.util.Random;
public class demo_sort {
	public static void main(String[] args) {
		Random random = new Random();
		int[] num = new int[60];
		for(int i = 0;i < num.length;i++){
			num[i]=random.nextInt(100);
		}
		sort(num);
		System.out.println(Arrays.toString(num));


	}
	public static void sort(int[] nums){
		for(int i = 0;i < nums.length-1;i++){
			for(int j = 0;j < nums.length-1-i;j++){
				if(nums[j] > nums[j+1]){
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}
}
