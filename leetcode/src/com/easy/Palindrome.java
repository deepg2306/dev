package com.easy;

import java.util.ArrayList;

public class Palindrome {

	 public static boolean isPalindrome(int x) {
		 if(x<0)
			 return false;
		ArrayList<Integer> arr= new ArrayList<Integer>();
		 while (x>0) {
			 arr.add(x%10);
			 x=x/10;
		}
		 System.out.println(arr.toString());
		 
		 for (int i = 0; i < arr.size(); i++) {
			 System.out.println(arr.get(i));
			 System.out.println(arr.get((arr.size()-(i+1))));
			if(arr.get(i)!=arr.get((arr.size()-(i+1))))
					return false;
		}
		 
	 return true;
	 }
	
	public static void main(String[] args) {
		boolean b=true;
		
		b=isPalindrome(10);
		System.out.println(b);
	}

}
