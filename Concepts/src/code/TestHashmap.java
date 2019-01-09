package code;

import java.util.HashMap;

public class TestHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,3,2,1};
		int[] standard= {2,3,5,9};
		HashMap<Integer, Integer> Result =time(arr);
		
		for (int i = 0; i < standard.length; i++) {
			Result=ans(Result,standard[i]);
		}
		
	}

		

		public static HashMap<Integer, Integer> time(int[] arr) {
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < arr.length; i++) {
				if (map.containsKey(arr[i])) {
					map.put(arr[i], map.get(arr[i]+1));
				}
				else
					map.put(arr[i], 1);
			  
			}
			System.out.println(map);
			return map;
		}
		
		private static HashMap<Integer, Integer> ans(HashMap<Integer, Integer> time, int limit) {
			for (int i = limit; i > 0; i--) {
				
			}
 
			
			return time;
		}
}
