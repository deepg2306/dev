package com.weekelycontests.wc_134;

import java.util.Scanner;

public class Moving_Stones_Until_Consecutive {

	public static void main(String[] args) {
		int[] result = new int[2];
		Scanner scr = new Scanner(System.in);
		System.out.println("a: ");
		int a = scr.nextInt();
		System.out.println("b: ");
		int b = scr.nextInt();
		System.out.println("c: ");
		int c = scr.nextInt();
		
		if((c-b)>1)
		{
			result[1]+=c-b;
		}
		if ((b-a)>1) {
			result[1]+=b-a;
		}
		
	}

}
