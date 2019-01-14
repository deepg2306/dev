package com.easy;

import java.util.HashMap;

public class RomanToInt {

	public static int romanToInt(String s) {
		HashMap<Character, Integer> symbol = new HashMap<Character, Integer>();
		int ans = 0, ret = 0;
		symbol.put('I', 1);
		symbol.put('V', 5);
		symbol.put('X', 10);
		symbol.put('L', 50);
		symbol.put('C', 100);
		symbol.put('D', 500);
		symbol.put('M', 1000);

		// Better Soln
		/*
		 * int len = s.length(), result = symbol.get(s.charAt(len - 1)); for (int i =
		 * len - 2; i >= 0; i--) { if (symbol.get(s.charAt(i)) >= symbol.get(s.charAt(i
		 * + 1))) result += symbol.get(s.charAt(i)); else result -=
		 * symbol.get(s.charAt(i)); } return result;
		 */

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I' && (i + 1) != s.length() && ((s.charAt(i + 1) == 'V') || (s.charAt(i + 1) == 'X'))) {
				if (s.charAt(i + 1) == 'V')
					ans = ans + 4;
				else if (s.charAt(i + 1) == 'X')
					ans = ans + 9;
				i++;
			} else if (s.charAt(i) == 'X' && (i + 1) != s.length()
					&& ((s.charAt(i + 1) == 'L') || (s.charAt(i + 1) == 'C'))) {
				if (s.charAt(i + 1) == 'L')
					ans = ans + 40;
				else if (s.charAt(i + 1) == 'C')
					ans = ans + 90;
				i++;
			} else if (s.charAt(i) == 'C' && (i + 1) != s.length()
					&& ((s.charAt(i + 1) == 'D') || (s.charAt(i + 1) == 'M'))) {
				if (s.charAt(i + 1) == 'D')
					ans = ans + 400;
				else if (s.charAt(i + 1) == 'M')
					ans = ans + 900;
				i++;
			} else
				ans = ans + symbol.get(s.charAt(i));

		}
		return ans;
	}

	public static void main(String[] args) {
		int a = romanToInt("MCMXCIV");
		System.out.println(a);
		// 1994
		// Input: "MCMXCIV"
		// Output: 1994
		// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
	}

}
