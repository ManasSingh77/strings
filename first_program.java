package String;

public class first_program {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="kaju"+"kamlesh";
		String str3=new String("Hello");
		String str4=new String("Hello");
		System.out.println(str1==str3);
		System.out.println(str1==str2);
		System.out.println(str4==str3);
		System.out.println(str1);
		str1=str1+"bye";
		System.out.println(str1);
		System.out.print(str2);
	}

}
