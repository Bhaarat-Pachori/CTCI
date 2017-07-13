package Chapter1;

import java.util.Arrays;

public class fourth_anagrams {
	
	public static boolean check_anagram(String word1, String word2) {
		
		char str1[] = word1.toCharArray();
		char str2[] = word2.toCharArray();
		boolean anagrams = true;
		Arrays.sort(str1);
		Arrays.sort(str2);
		for(int i=0;i<str1.length;i++) {
			if(str1[i] == str2[i]) {
				continue;
			}
			else {
				anagrams = false;
			}
		}
		return anagrams;
	}
	
	public static void main(String args[]) {
		String word1 = "care";
		String word2 = "acre";
		
		System.out.printf("Strings are %s",check_anagram(word1, word2) ? "anagrams":"not anagrams");
		
	}
}