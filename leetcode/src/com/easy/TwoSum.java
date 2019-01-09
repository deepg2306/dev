package com.easy;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] trgt = { 2, 7, 11, 15 };
		int tgt = 18;
		int[] ans = { 0, 0 };
		for (int i = 0; i < trgt.length; i++) {
			for (int j = i + 1; j < trgt.length; j++) {
				if (trgt[i] + trgt[j] == tgt) {
					ans[0] = i;
					ans[1] = j;
				}
			}

		}
		System.out.println(Arrays.toString(ans));
	}

}
