package com.algorithm.Implementation;

public class Kangaroo {

	public static void main(String[] args) {
		int x1=43,v1=2,x2=70,v2=2;
		int relativespeed= Math.abs(v1-v2);
		int relativedistance=Math.abs(x1-x2);
		if(x2>x1 && v2>v1)
			System.out.println("NO");
		else if(x1>x2 && v1>v2)
			System.out.println("NO");
		else if(relativespeed==0)
			System.out.println("NO");
		else if(relativedistance%relativespeed==0)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}

}
