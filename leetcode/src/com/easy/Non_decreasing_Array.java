package com.easy;

public class Non_decreasing_Array {

	public static boolean checkPossibility(int[] nums) {
		if (nums == null || nums.length <= 1) return true;
        boolean found = false;
        for (int i = 1; i< nums.length; i++){
            if(nums[i]<nums[i-1]){
                if(found) return false;
                else {
                    if(i-2>=0 && nums[i]<nums[i-2]) nums[i] = nums[i-1];
                    found = true;
                }
            }
        }
        return true;
		/*
		 * int count=0; for (int i = 0; i < nums.length-1; i++) { if (nums[i]>nums[i+1])
		 * { count++; if (count>1) return false; } } return true;
		 */
	}

	public static void main(String[] args) {
		int[] test= {3,4,2,3};
		boolean ans;
		System.out.println(ans=checkPossibility(test));
		

	}

}
