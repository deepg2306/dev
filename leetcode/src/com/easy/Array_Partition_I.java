package com.easy;

import java.util.Arrays;

public class Array_Partition_I {

	public static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int current_min, result = 0;
		for (int i = 0; i < nums.length; i = i + 2) {
			current_min = Math.min(nums[i], nums[i + 1]);
			System.out.println("Subpair " + i + "(" + nums[i] + ")" + "(" + nums[i + 1] + ") =" + current_min);
			result += current_min;
		}
		return result;

	}

	public static void main(String[] args) {
		int[] test = { 1, 62, 6, 45 };
		System.out.println(arrayPairSum(test));
	}

}

