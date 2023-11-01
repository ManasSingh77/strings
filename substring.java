package String;

public class substring {

	public static void main(String[] args) {
		String s="hello";
		int n=s.length();
//		System.out.println(s.substring(2,7));
//		System.out.println(s.substring(3));
//		System.out.println(s.substring(3,3));
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length()+1;j++) {
				System.out.println(s.substring(i,j));
			}
		}
		

	
	}
}
