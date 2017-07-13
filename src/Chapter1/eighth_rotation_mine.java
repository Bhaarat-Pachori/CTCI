package Chapter1;

import java.util.Arrays;

public class eighth_rotation_mine {
	
	public static boolean isSubString(String main, String sub) {
		char str_main[] = main.toCharArray();
		char str_sub [] = sub.toCharArray();
		int len = str_main.length -1;
		boolean isSubString = false;
		char temp ;
		
		for(int i=0; i<str_main.length; i++) {
			temp = main.charAt(i);
			if(!isSubString) {
			for(int j=0;j<str_main.length-1;j++) {
				str_main[j] = str_main[j+1];
			}
			str_main[len] = temp;
			if(Arrays.equals(str_main, str_sub)) {
					isSubString = true;
				}
			}
		}
		return isSubString;
	}
	
	public static void main(String args[]) {
		String main = "apple";
		String sub =  "ppale";
		System.out.printf("%s is %s substring of %s",sub,(isSubString(main, sub)) ? "a": "not a",main);
	}
}