package keywords;

public class ClassB extends ClassA{
	
	int i = 20;  //class instance
	void display(int i) {
		System.out.println(super.i);
//		System.out.println(this.i);
//		System.out.println(super.i);
	}
	
	public static void main(String[] args) {
		ClassB obj = new ClassB();
		obj.display(30);
	}

}
