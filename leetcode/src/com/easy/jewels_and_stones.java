package com.easy;

import java.util.HashMap;
import java.util.HashSet;

public class jewels_and_stones {

	public static int numJewelsInStones(String J, String S) {
		int count = 0;
		HashSet<Character> store_J = new HashSet<Character>();
		for (int i = 0; i < J.length(); i++) {
			store_J.add(J.charAt(i));
		}
		for (int i = 0; i < S.length(); i++) {
			if (store_J.contains(S.charAt(i)))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String J = "z";
		String S = "ZZz";
		System.out.println(numJewelsInStones(J, S));

	}

}
