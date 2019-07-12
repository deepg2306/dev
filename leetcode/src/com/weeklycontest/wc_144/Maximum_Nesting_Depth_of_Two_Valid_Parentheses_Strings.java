package com.weeklycontest.wc_144;

import java.util.ArrayList;

public class Maximum_Nesting_Depth_of_Two_Valid_Parentheses_Strings {

	public static void main(String[] args) {

		String test = "()(())()";

		int[] result = maxDepthAfterSplit(test);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}

	public static int[] maxDepthAfterSplit(String seq) {
		int open = -1;
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < seq.length(); i++) {
			if (seq.charAt(i) == '(') {
				open++;
				//result.add(open);
			} else {
				result.add(open);
				open--;
			}
		}
		int[] returnresult = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			returnresult[i] = result.get(i);
		}
		return returnresult;
	}

}
