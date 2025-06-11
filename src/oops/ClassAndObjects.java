package oops;

public class ClassAndObjects {

	public static void main(String[] args) {
		System.out.println("Main Method");
//		ClassAndObjects  - Class name
//		object = Ref. Variable
//		new - keyword
//		ClassAndObjects() - constructor
//		new ClassAndObjects();  - Object
		ClassAndObjects object = new ClassAndObjects();
		ClassAndObjects.run();
		object.drink();
		object.sleep();
	}
	
	public static void run() {
		System.out.println("Display method");
	}
	
	public void drink() {
		System.out.println("Drink method");
	}
	
	public void sleep() {
		System.out.println("Sleep method");
	}

}
