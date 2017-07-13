package Chapter1;

public class one_uniqueChars {
	
	public static boolean unique(String word) {
		int[] container = new int[256];
		boolean isunique = true;
		
		// Can convert all the characters to lower case
		//word = word.toLowerCase();
		//System.out.println(word);
		
		for(int i=0; i<word.length(); i++) {
			char charat = word.charAt(i);
			int val = (int)charat;
			// Can convert the characters to lower case
			if(val>= 65 && val<= 90) {
				val = val + 32;
			}
			if(container[val] == 0) {
			container[val] = 1;
			}
			else {
				isunique = false;
			}
		}
		return isunique;
	}
	
	public static void main(String args[]) {
		String word = "Testing";
		System.out.printf("String \"%s\" %s characters in it.",word, (unique(word)?"has Unique":"has duplicate"));
	}
}