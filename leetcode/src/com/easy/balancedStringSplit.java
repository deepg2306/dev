//1221. Split a String in Balanced Strings
package com.easy;

public class balancedStringSplit {

	public static void main(String[] args) {
		int result =0;
		result =balancedStringSplit1("RLRRLLRLRL");
		System.out.println(result);
	}

	static int balancedStringSplit1(String s) {
		int r=0,l=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R') {
				r++;
			}
			if (s.charAt(i) == 'L') {
				l++;
			}
		}
		return 0;
	}

}
