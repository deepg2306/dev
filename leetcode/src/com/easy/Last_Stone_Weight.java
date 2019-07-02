package com.easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Last_Stone_Weight {

	public static int lastStoneWeight(int[] stones) {
		Map<Integer, Integer> map =  new HashMap<Integer, Integer>();
		for (int i = 0; i < stones.length; i++) {
			map.put(i, stones[i]);
		}
		
		return 0;
	}

	public static void main(String[] args) {
		int[] array = { 2, 7, 4, 1, 8, 1 };
		int ans = lastStoneWeight(array);
		System.out.println(ans);

	}

}
