package String;

public class palindrome {

	public static void main(String[] args) {
		String s1="manam";
		System.out.println(palindrome(s1));

	}
	public static boolean palindrome(String s1) {
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s1.charAt(s1.length()-1-i)) {
				return false;
			}
		}
		return true;
	}

}
