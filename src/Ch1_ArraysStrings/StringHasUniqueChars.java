package Ch1_ArraysStrings;
import java.util.Arrays;

public class StringHasUniqueChars {

    public static boolean uniqueChars1(String s) {
       if (s.length() > 256) {
            return false
        }

        boolean[] charSet = new boolean[256]

        for (int i=0; s.length(); i++) {
            int val = s.charAt(i);
            
            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;

            } 
        }
        return true;
    } 




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
