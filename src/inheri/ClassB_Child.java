package inheri;

public class ClassB_Child extends ClassA_Parent{
	
//	Class-B is inheriting the properties of Class-A in child class is known as Inheritance.  
//  When method name is same in parent class as well as in child class with same no of parameters is known as method overriding.
	public void cycle() {
		System.out.println("ClassB_Child - Cycle Function");
	}
	
	public void bullet() {
		System.out.println("ClassB_Child - Bullet Function");
	}
}
