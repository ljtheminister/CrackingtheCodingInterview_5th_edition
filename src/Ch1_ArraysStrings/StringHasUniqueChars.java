package Ch1_ArraysStrings;
import java.util.Arrays;

public class StringHasUniqueChars {

	public static boolean uniqueChars(String s) {
		if (s.equals(""))
			return true;
		
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		
		for (int i=1; i < chars.length; i++) {
			if (chars[i-1]==chars[i])
				return false;
		}
		return true;
	}	

	public static void main(String[] args) {
		String s = "abcdef01";
		System.out.println(uniqueChars(s));
	}
}
