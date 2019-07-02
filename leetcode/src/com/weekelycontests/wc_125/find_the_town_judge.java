package com.weekelycontests.wc_125;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class find_the_town_judge {
	
	public static int findJudge(int N, int[][] trust) {
		
		int[] count = new int[N + 1];
		for (int[] t : trust) {
			count[t[0]]--;
			count[t[1]]++;
		}
		for (int i = 1; i <= N; ++i) {
			if (count[i] == N - 1)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[][] trust = { { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 4, 3 } };
		// int i = findJudge(4, trust);
		for (int j = 0; j < trust.length; j++) {
			for (int j2 = 0; j2 < 2; j2++) {
				System.out.print(trust[j][j2]);
			}
			System.out.println();

		}

	}

}
