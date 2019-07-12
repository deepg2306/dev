package com.weekelycontests.wc_143;

public class Distribute_Candies_to_People {

	public static void main(String[] args) {
		int[] solution = distributeCandies(10, 3);
		for (int i = 0; i < solution.length; i++) {
			System.out.print(solution[i]);
			//523
		}

	}

	public static int[] distributeCandies(int candies, int num_people) {
		int j=0,k=0;
		int[] people = new int[num_people];
		
		while(candies>0)
		{
			if (j>num_people-1) {
				j=0;
			}
			people[j]+=k;
			k++;
			candies--;
		}
		
		
		return people;

	}
}
