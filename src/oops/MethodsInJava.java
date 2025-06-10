package oops;

public class MethodsInJava {

	public static void main(String[] args) {
		System.out.println("Main Method");
//		demo();  // Cannot make a static reference to the non-static method demo() from the type MethodsInJava
		demo();
		
	}
	
	public static void demo() {
		System.out.println("Demo Method");
	}
	
	public void display() {
		System.out.println("Display Method");
	}

}
