package ArraysStrings;
import java.util.Arrays;

public class StringsArePermutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "cbad";
		System.out.println(arePermutations(s1,s2));
	
	}

	
	public static boolean arePermutations(String s1, String s2) {
		
		if (s1.length() != s2.length())
			return false;
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for (int i=0; i < c1.length; i++) {
			if (c1[i] != c2[i])
				return false;
		}
		
		return true;
		
		
		
		
	}
}
