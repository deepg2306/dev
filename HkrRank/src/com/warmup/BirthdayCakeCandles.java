package com.warmup;

import java.util.Arrays;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {82,49,82,82,41,82,15,63,38,25};
		int high=ar[0];
		int count=0;
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>high)
			{
				high=ar[i];
				count=1;
			}
			else if(ar[i]==high)
				count++;
		}
		System.out.println(ar.length);
		System.out.println(count);
		System.out.println(ar.length-count);
	}

}
