package Chapter1;

public class three_duplicate {
	
	public static String removeDuplicate(String word) {
		
		int len = word.length();
		char str1[] = new char[len];
		boolean found_dup = false;
		
		if(len > 0) {
		for(int i=0;i<len;i++) {
			char character = word.charAt(i);
			for(int j=0;j<str1.length;j++) {
				if(str1[j] != character ) {
					continue;
				}
				else {
					if(character != ' ') {
					found_dup = true;
					break;
					}
				}
			}
			if(!found_dup) {
			str1[i] = character;
			}
			found_dup = false;
		}
		return new String(str1);
		}
		else 
			return "Found Empty String!!";
			
	}
	
	public static void main(String args[]) {
		String word = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz";
		System.out.printf("String after removing duplicates:[%s]", removeDuplicate(word));
		
	}
}