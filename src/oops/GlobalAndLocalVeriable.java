package oops;

public class GlobalAndLocalVeriable {
	int m = 50;   // Global non-static variable
	static String name = "Dev"; // Global static variable

	public static void main(String[] args) {
		int a = 10;  // local variable
		int b = 20;  // local variable
		System.out.println(a+b);
		System.out.println(name);
		
		GlobalAndLocalVeriable obj = new GlobalAndLocalVeriable();
		obj.add();
		System.out.println(obj.m);
		int n = 100;
		System.out.println(obj.m+n);

	}
	
	public void add() {
		System.out.println(name);
	}

}
