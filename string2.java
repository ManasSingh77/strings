package String;

public class string2 {

	public static void main(String[] args) {
		String s="Hellobyeok";
		System.out.print(s.length());
		System.out.println(s.charAt(5));
		String s1="hello";
		String s2=new String("hello");
		System.out.println(s1.equals(s2));
		System.out.println(equals(s1,s2));
	}
	public static boolean equals(String s1,String s2) {
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
