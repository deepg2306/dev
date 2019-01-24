import java.util.HashMap;

//1.2 Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.page 101

public class CheckPermutation {

	public static boolean permute(String str1,String str2) {
		HashMap<Character, Boolean> hash = new HashMap<Character, Boolean>();
		if(str1.length()!=str2.length())
			return false;
		for (int i = 0; i < str1.length(); i++) {
			hash.put(str1.charAt(i), false);
		}
		for (int i = 0; i < str2.length(); i++) {
			if (hash.containsKey(str2.charAt(i)) && (hash.get(str2.charAt(i))==false)) {
				hash.put(str2.charAt(i), true);
			}
			else
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Boolean b= permute("Helo", "oleH");
		System.out.println(b);

	}

}
