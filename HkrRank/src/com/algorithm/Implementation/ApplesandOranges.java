package com.algorithm.Implementation;

public class ApplesandOranges {

	public static void main(String[] args) {
		int s=7,t=11,a=5,b=15;
		int[] apples= {-2,2,1};
		int[] oranges= {5,-6};
		int o=0,app=0;
		for (int i = 0; i < apples.length; i++) {
			apples[i]+=a;
			if ((apples[i]>=s)  && (apples[i]<=t)) {
				app++;
			}
		}
		for (int i = 0; i < oranges.length; i++) {
			oranges[i]+=b;
			if ((oranges[i]>=s)  && (oranges[i]<=t)) {
				o++;
			}
		}
		System.out.println(app);
		System.out.println(o);

	}

}
