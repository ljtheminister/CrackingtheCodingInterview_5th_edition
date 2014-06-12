package Ch1_ArraysStrings;

public class StringRepeatCharsCompression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "cccc1";
		StringBuffer comp = new StringBuffer();
		
		char c;
		int j;
		int rep;
		
		for (int i=0; i < s.length(); ) {
			c = s.charAt(i);			
			j = i+1;
			rep = 1;
			while (j < s.length() && s.charAt(j)==c) {
				rep++;
				j++;
			} //end while
			comp.append(c);
			comp.append(rep);
			i += rep;
		} //end for
				
		if (comp.length() < s.length())
			System.out.println(comp);
		else
			System.out.println(s);
		
	} //end main

} //end class
