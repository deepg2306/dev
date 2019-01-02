package com.algorithm.Implementation;

import java.util.Arrays;

public class GradingStudents {

	public static void main(String[] args) {
		int[] grade= {73,67,38,33};
		
		for (int i = 0; i < grade.length; i++) {
			System.out.println(grade[i] < 38 || grade[i] % 5 < 3 ? grade[i] : grade[i] + (5 - (grade[i] % 5)));
			/*
			 * if (grades[i]<38) { }
			 * 
			 * else if (grades[i]==38) { grades[i]=40; } else if ((grades[i]+1)%5==0) {
			 * grades[i]+=1; } else if ((grades[i]+2)%5==0) { grades[i]+=2; }
			 */
		}
		//System.out.println(Arrays.toString(grades));
	}

}

//better solutions

//System.out.println(grade < 38 || grade % 5 < 3 ? grade : grade + (5 - (grade % 5)));

//grade[i] < 38 || grade[i] % 5 < 3 
// grade[i]
//grade[i] + (5 - (grade[i] % 5))