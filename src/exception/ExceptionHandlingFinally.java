package exception;

public class ExceptionHandlingFinally {

	public static void main(String[] args) {
		int n = 10;
		int m = 0;
		
		try {
			int ans = n/m;
			System.out.println(ans);
		} catch (Exception e){
			System.out.println("Exception Handled");
		} finally {
			System.out.println("Remaining code");
			System.out.println("Remaining code");
		}
		
		

	}

}
