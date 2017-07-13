package Chapter1;

public class eighth_rotation {
	
	public static boolean rotation(String main, String sub) {

		int len = main.length();
		if(len == sub.length() && len > 0) {
			String s1s1 = main + main;
			if(s1s1.indexOf(sub) != -1) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String args[]) {
		String s1 = "apple";
		String s2 = "ppale";
		
		System.out.printf("%s is %s substring of %s",s2,(rotation(s1, s2)) ? "a": "not a",s1);
	}
}