package com.warmup;

import java.util.Arrays;

public class TimeConversion {

	public static void main(String[] args) {
		String str = new String("00:05:05AM");
		int hours=0,minutes=0,seconds=0;
		String dn= str.substring(8, 10);
		hours= Integer.parseInt(str.substring(0, 2));
		minutes= Integer.parseInt(str.substring(4, 5));
		seconds= Integer.parseInt(str.substring(6, 8));
		
		
		
		if(dn.equals("AM"))
		{
			if(hours==12)
				hours=00;
			System.out.println(String.format("%02d", hours)+":"+String.format("%02d", minutes)+":"+String.format("%02d", seconds));
		}
		else
			System.out.println(String.format("%02d", hours)+":"+String.format("%02d", minutes)+":"+String.format("%02d", seconds));
		
		
		System.out.println(hours);
		System.out.println(minutes);
		System.out.println(seconds);
		System.out.println(dn);
		
		
		

	}

}

// debug the following code
/*
 * final String str = new String("07:05:45PM"); int length=str.length(); int
 * newtime[]= {length};
 * 
 * 
 * 
 * for (int i = 0; i< length; i++) { //newtime[i]=Integer.parseInt(str[i]);
 * 
 * 
 * }
 * 
 * System.out.println(Arrays.toString(newtime));
 */