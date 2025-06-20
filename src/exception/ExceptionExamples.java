package exception;

public class ExceptionExamples {

	public static void main(String[] args) {
		final int a = 10;
//		a = 20;
		int b = 0;

		try {
			int c = a/b;
			System.out.println("C: " +c);
		} finally {
			System.out.println("Finally block");
		}


		//		Can we use multiple try block with Single catch block?
		//		NO
		// 		Can we use multiple catch block with Single try block?
        //		YES
		
		try {
			int d = a/b;
			System.out.println("Single Try D: " +d);
		}catch (ArithmeticException e) {

		}catch(Exception ex) {
			
		}finally {
			System.out.println("Second Finally block");
		}

	}

}
