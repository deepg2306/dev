package com.easy;

import java.util.ArrayList;

public class Palindrome {

	 public static boolean isPalindrome(int x) {
		ArrayList<Integer> arr= new ArrayList<Integer>();
		 while (x>0) {
			 arr.add(x%10);
			 x=x/10;
		}
		 System.out.println(arr.toString());
		 
		 for (int i = 1; i <= arr.size(); i++) {
			if(arr.get(i)!=arr.get((arr.size()-i)))
					return false;
		}
		 
	 return true;
	 }
	
	public static void main(String[] args) {
		boolean b=true;
		
		b=isPalindrome(121);
		System.out.println(b);
	}

}
