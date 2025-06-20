package string;

public class ConstructorConcept {

	public static void main(String[] args) {
		System.out.println("Main method");
		ConstructorConcept obj = new ConstructorConcept();
		obj.display();

	}
	
	public void display() {
		System.out.println("Display method");
	}
	
	static {
		System.out.println("Static block");
	}
	
	{
		System.out.println("Block");
	}
	
	ConstructorConcept(){   // constructor 
		System.out.println("constructor block");
	}

}
