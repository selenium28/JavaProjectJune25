package collection;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
//		Array - Size is fixed
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Diya");
		list.add("Pooja");
		list.add("Eshwari");
		list.add("Eshwari");
		
		System.out.println("Students name: " +list);
		list.addFirst("Dev");
		System.out.println("After Adding First: " +list);
		list.removeLast();
		System.out.println("After Removing: " +list);
		
		System.out.println("Frist name: " +list.getFirst());
		
		list.set(3, "Pooja");
		System.out.println("After setting roll no: " +list);

	}

}
