package oops;

public class MethodOverloading {
//  Can we overload main method?  => Yes We can 
	public static void main(String[] args) {
		System.out.println("Main method");
		MethodOverloading obj = new MethodOverloading();
		obj.display();
		obj.display(10);	

	}
	
//	public static void main() {
//		
//	}
	// Duplicate method name is not allowed in Java
	public void display() { 
		System.out.println("Display method with zero Parameter");
	}
	
	public void display(int a) {
		System.out.println("Display method with one parameter");
		a = 10;
	}
	
	public void display(int m, int n) {
		System.out.println("Display method with two parameter");
		int c = m+n;
	}
	
	public void display(double d) {
		System.out.println("Display method with one parameter & diff datatype");
	}

}
