package basic;

public class ArrayConcept {

	public static void main(String[] args) {
//		Array -> To store similar data types in array variable
//		a[] - array variable
//		int a = 5;
		int a[] = new int[6];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;
		
//		System.out.println(a[2]);
//		System.out.println(a[4]);
//		System.out.println(a[5]);  // ArrayIndexOutOfBoundsException
		for(int i = 0; i< a.length; i++) {
			System.out.println(a[i]);
		}
		
		double d[] = new double[10];
		d[1] = 33.33;
		
		

	}

}
