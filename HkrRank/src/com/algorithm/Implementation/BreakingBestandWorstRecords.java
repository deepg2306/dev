package com.algorithm.Implementation;

public class BreakingBestandWorstRecords {

	public static void main(String[] args) {
		int[] scores= {12,24,10,24};
		int min=scores[0],max=scores[0],countmin=0,countmax=0;
		for (int i = 1; i < scores.length; i++) {
			if (scores[i]>max) {
				max=scores[i];
				countmax++;
			}
			else if (scores[i]<min) {
				min=scores[i];
				countmin++;
			} 
		}
		System.out.println(countmax+" "+countmin);
	}

}
