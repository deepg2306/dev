package com.ArraysandStrings;

public class OneAway {

	public static boolean oneaway(String str1, String str2) {
		int count = 0;
		if (str1.contains(str2)) {
			return true;
		} else {
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					count++;
					if (count > 1)
						return false;

				}
			}

		}
		return true;
	}

	public static void main(String[] args) {
		boolean bl= oneaway("hello","helol");
		System.out.println(bl);
	}

}
