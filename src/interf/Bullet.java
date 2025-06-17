package interf;

public class Bullet implements Bike, Mopade{

	@Override
	public void cbz() {
		System.out.println("Bullet - implements - cbz method");
		
	}

	@Override
	public void shine() {
		System.out.println("Bullet - implements - shine method");
		
	}

	@Override
	public void honda() {
		System.out.println("Bullet - implements - honda method");
		
	}

	@Override
	public void access() {
		System.out.println("Mopade - ");
		
	}

}
