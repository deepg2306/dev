package com.warmup;

import java.util.Arrays;

public class MiniMazSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long ar[] = {396285104,573261094,759641832,819230764,364801279};
		long mid=0;
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		mid=ar[1]+ar[2]+ar[3];
		
		System.out.println(ar[4]+mid);
		
		System.out.println((ar[0]+mid)+" "+(ar[4]+mid));

	}

}
