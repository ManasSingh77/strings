package String;

public class lexeographically {

	public static void main(String[] args) {
		String s1="raj";
		String s2="rajesh";
		System.out.println(s1.compareTo(s2));
		String s3="kunal";
		String s4="komal";
		System.out.println(s3.compareTo(s4));
		System.out.println(compareTo(s3,s4));
		System.out.println(compareTo(s1,s2));
	}
	public  static int compareTo(String s1,String s2) {
		int n=Math.min(s1.length(),s2.length());
		for(int i=0;i<n;i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return (int)s1.charAt(i)-(int)s2.charAt(i);
			}
		}
			return s1.length()-s2.length();
	}
	
}
