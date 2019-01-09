package code;

import java.util.HashMap;

public class TestHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,3,2,1};
		System.out.println(time(arr));
		System.out.println(ans(arr));
		
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
			return map;
		}
		
		public static HashMap<Integer, Integer> name() {
			
		}
}
