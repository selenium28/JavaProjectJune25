package collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		names.add("Diya");
		names.add("Pooja");
		names.add("Eshwari");
		names.add("Pooja"); // Duplicate, will be ignored
		names.add("Dev");
		
		System.out.println("Names: " +names);
		System.out.println("Contains 'Eshwari':" +names.contains("Eshwari"));
		System.out.println("No of students: " +names.size());
		
		System.out.println("All Names: ");
		for (String name : names) {
			System.out.println(name);
		}

	}

}
