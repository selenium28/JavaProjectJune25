package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int n = 10;
		int m = 0;
		
		try {
			int ans = n/m;
			System.out.println(ans);
		} catch (ArithmeticException e) {
			System.out.println("[Error]:Arithmetic Exception Handled ");
		}
		
		System.out.println("Remaining code");
		System.out.println("Remaining code");
		System.out.println("Remaining code");
		System.out.println("Remaining code");
		System.out.println("Remaining code");
		
		

	}

}
