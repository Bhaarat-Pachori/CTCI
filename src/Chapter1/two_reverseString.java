package Chapter1;

public class two_reverseString {
	
	public static String DoReverse(String str) {
		
		char [] str1 = str.toCharArray();
		int start = 0;
		int end = str.length() -2;
		while(start <= end) {
			char temp = str1[start];
			str1[start] = str1[end];
			str1[end] = temp;
			start++;
			end--;
		}
		
		return new String(str1);
	}
	
	public static void main(String args[]) {
		String str = "bhaarat\0";
		str = DoReverse(str);
		System.out.printf("Reverse is %s", str);
	}
}