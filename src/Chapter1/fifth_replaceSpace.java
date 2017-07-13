package Chapter1;

public class fifth_replaceSpace {
	
	public static String replace_space(String sentence) {
		
		int total_space = 0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i) == ' ') 
				total_space++;
		}
		char str1[] = new char[sentence.length()+(total_space *2)];
		int k= str1.length -1;
		for(int j=sentence.length()-1;j>=0;j--) {
			if(sentence.charAt(j) == ' ') {
				str1[k] = '0';
				k--;
				str1[k] = '2';
				k--;
				str1[k] = '%';
				k--;
			}
			else {
				str1[k] = sentence.charAt(j);
				k--;
				//break;
			}
	}
		
		return new String(str1);
	}
	
	
	public static void main(String args[]) {
		String sentence = "This is a string with spaces";
		
		System.out.printf("String with replaced spaces %s",replace_space(sentence));
	}
}