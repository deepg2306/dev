package com.warmup;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

public class PlusMinus {

	public static void main(String[] args) {
		int arr[] = {4,-3,9,0,-4,-1};
		int arraylength=0;
		float [] out = new float [3];
		DecimalFormat df = new DecimalFormat("#.######");
		df.setRoundingMode(RoundingMode.CEILING);
		
		float positive=0,negative=0,zero=0;
		arraylength= arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0)
				positive++;
			else if(arr[i]<0)
				negative++;
			else
				zero++;
		}
		
		System.out.println(df.format(positive/arraylength));
		System.out.println(df.format(negative/arraylength));
		System.out.println(df.format(zero/arraylength));
		
		
	}

}
