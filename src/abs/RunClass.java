package abs;

public class RunClass {

	public static void main(String[] args) {
//		Car objCar = new Car();  We can't create object of abstrat class
		Nexon objNexon = new Nexon();
		objNexon.buttonStart();
		objNexon.carSpeed();
		objNexon.seatBelt();

	}

}
