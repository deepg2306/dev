package com.easy;

import java.util.Arrays;

public class Height_Checker {

	public static int heightChecker(int[] heights) {

		int[] sorted = new int[heights.length];
		sorted = heights.clone();
		int count = 0;
		Arrays.sort(sorted);

		for (int i = 0; i < heights.length; i++) {

			if (heights[i] != sorted[i]) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] array = { 1, 1, 4, 2, 1, 3 };
		System.out.println(heightChecker(array));
	}

}
