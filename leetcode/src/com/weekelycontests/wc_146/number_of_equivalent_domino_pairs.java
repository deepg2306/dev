package com.weekelycontests.wc_146;

import java.util.HashMap;

public class number_of_equivalent_domino_pairs {

	public static void main(String[] args) {
		int[][] input = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 5, 6 } };
		int retest = numEquivDominoPairs(input);

	}

	public static int numEquivDominoPairs(int[][] dominoes) {
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		int res = 0;
		for (int[] d : dominoes) {
			System.out.println(d[0]);
			System.out.println(d[1]);
			System.out.println(Math.min(d[0], d[1]));
			System.out.println(Math.min(d[0], d[1]) * 10);
			System.out.println(Math.max(d[0], d[1]));
			int k = Math.min(d[0], d[1]) * 10 + Math.max(d[0], d[1]);
			count.put(k, count.getOrDefault(k, 0) + 1);
		}
		for (int v : count.values()) {
			res += v * (v - 1) / 2;
		}
		return res;
	}

}
