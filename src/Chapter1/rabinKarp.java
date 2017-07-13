package Chapter1;

public class rabinKarp {
	
	// Rabin-Karp
	public static void isSubString(String main, String pattern) {
		//char str_main[] = main.toCharArray();
		//char str_sub [] = pattern.toCharArray();
		
		int window_size = pattern.length();
		int patt_hash_val = pattern.hashCode();
		int main_hash_val = 0;
		
		// Take pieces of length 2 from main string and calculate hashCode
		for(int i=0;i<main.length()-pattern.length();i++) {
			String piece = main.substring(i,i+ window_size);
			main_hash_val = piece.hashCode();
			if(main_hash_val == patt_hash_val) {
				System.out.println("Occurrence found at index "+(i+1));
			}
		}
	}
	
	public static void main(String args[]) {
		String main = "Bhaarat Pachori";
		String patt = "rat P";
		isSubString(main, patt);
	}
}