package interf;

public class RunClass {

	public static void main(String[] args) {
		Bullet objBullet = new Bullet();
		objBullet.cbz();
		
//		Bike objBike = new Bike();  // We can't create object of interface
		
		Bike obj = new Bullet();
		
		

	}

}
