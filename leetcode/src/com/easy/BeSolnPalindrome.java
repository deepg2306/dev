package com.easy;

import java.util.ArrayList;

public class BeSolnPalindrome {
	public static boolean isPalindrome(int x) {
		    if (x<0 || (x!=0 && x%10==0)) return false;
		    int rev = 0;
		    while (x>rev){
		    	rev = rev*10 + x%10;
		    	x = x/10;
		    }
		    return (x==rev || x==rev/10);
		}
	 
	
	public static void main(String[] args) {
		boolean b=true;
		
		b=isPalindrome(121);
		System.out.println(b);
	}

}
