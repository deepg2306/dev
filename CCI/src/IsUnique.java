import java.util.HashMap;
import java.util.Iterator;

//Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
//page 101
public class IsUnique {

	public static boolean IsUnique(String str) {
		if (str.length() > 128)
			return false;

		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			System.out.println(val);
			if (char_set[val])
			{// Already found this char in string
				System.out.println(char_set[val]);
				return false;
			}
			char_set[val] = true;
		}
		return true;
		/*
		 * HashMap<Character, Boolean> map= new HashMap<Character, Boolean>(); for (int
		 * i = 0; i < str.length(); i++) { if(map.containsKey(str.charAt(i))) return
		 * false; else map.put(str.charAt(i), true);
		 * 
		 * } return true;
		 */
	}

	public static void main(String[] args) {
		boolean a;
		String str = "Heelo";
		a = IsUnique(str);
		System.out.println(a);
	}

}
