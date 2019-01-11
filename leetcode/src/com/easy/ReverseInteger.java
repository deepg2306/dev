package com.easy;

public class ReverseInteger {

	public static void main(String[] args) throws Exception{
		int x=1534236469,y=0;
		while (Math.abs(x)>0) {
			if (y>Integer.MAX_VALUE || y<Integer.MIN_VALUE) {
				System.out.println(0);
			}
			y=(y*10)+(x%10);
			x=x/10;
		}
		if (x<0) {
			System.out.println(-1*y);
		}
		System.out.println(y);
		

	}
	

}
