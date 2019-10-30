package com.weekelycontests.wc_143;

public class Distribute_Candies_to_People {

	public static void main(String[] args) {
		int[] solution = distributeCandies(7, 4);
		for (int i = 0; i < solution.length; i++) {
			System.out.print(solution[i]);
			// 523
		}

	}

	/*public static int[] distributeCandies(int candies, int num_people) {
		int j = 0, k = 0;
		int[] people = new int[num_people];

		while (candies > 0) {
			if (j > num_people - 1) {
				j = 0;
			}
			k++;
			if (candies<num_people-1) {
				people[j]=candies;
				break;
			}
			people[j] += k;
			candies-=people[j];
			j++;
		}*/
		
		
		public static int[] distributeCandies(int candies, int n) {
	        int[] res = new int[n];
	        for (int i = 0; candies > 0; ++i) {
	            res[i % n] += Math.min(candies, i + 1);
	            candies -= i + 1;
	        }
	        return res;
	    }

		//return people;

	}

