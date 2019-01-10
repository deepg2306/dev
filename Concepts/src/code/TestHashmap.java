package code;

import java.util.HashMap;

import javax.naming.spi.DirStateFactory.Result;

public class TestHashmap {

	static String result1 = "";

	public static void main(String[] args) {

		int[] arr = { 5, 3, 7, 1 };
		int[] standard = { 2, 3, 5, 9 };
		HashMap<Integer, Integer> Result = time(arr);

		for (int i = 0; i < standard.length; i++) {
			Result = ans(Result, standard[i]);
		}
		System.out.println(Result);
		System.out.println(result1.substring(0,2)+":"+result1.substring(2,4));
	}

	public static HashMap<Integer, Integer> time(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i] + 1));
			} else
				map.put(arr[i], 1);

		}
		System.out.println(map);
		return map;
	}

	private static HashMap<Integer, Integer> ans(HashMap<Integer, Integer> time, int limit) {
		for (int i = limit; i > 0; i--) {
			if (time.containsKey(i) && (time.get(i)>0)) {
				result1 += Integer.toString(i);// Check static properties
				time.put(i, time.get(i) - 1);
				break;
			}
		}

		
		return time;
	}
}
