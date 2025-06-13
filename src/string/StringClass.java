package string;

public class StringClass {

	public static void main(String[] args) {
//		String is class in Java
//		String is a Immutable in Java
		String str = "Automation";
		String str2 = new String("Selenium");
		String str3 = "Java";
		String str4 = new String("Selenium");
		String str5 = "Testing";
		String str6 = "Java";
		String str7 = "Java";
		String str8 = new String("Java");
		String str9 = "Selenium";
		
//		System.out.println(str);
//		System.out.println(str2);
		
		System.out.println(str.equals(str7));
		System.out.println(str2.equals(str9));
		System.out.println(str2==str9);
		System.out.println(str2==str4);
		System.out.println(str6==str7);
		
		
		
	}

}
