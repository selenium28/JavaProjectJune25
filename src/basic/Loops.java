package basic;

public class Loops {

	public static void main(String[] args) {
//		System.out.println("Hello - 1");
//		System.out.println("Hello - 2");
//		System.out.println("Hello - 3");
//		System.out.println("Hello - 4");
//		System.out.println("Hello - 5");
		
		int i = 1;  // Initialization
		while(i <=5) {  // Condition
			System.out.println("Hello " +i);
			i++;   // Increment 
		}
		
//		for(Initialization, Condition, Increment/decrement)
		for (int j = 5; j >= 1; j--) {
			System.out.println("Java " +j);
		}
		
		int k = 1;
		do {
			System.out.println("Testing " +k);
			k++;
		} while(k <=5);
		
		
	}
}


// Print - 2 to 20 -> 2 4 6 8... 20