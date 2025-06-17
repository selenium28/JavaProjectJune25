package interf;

public interface Bike {

	public void cbz();
	public void shine();
	public void honda();
	
	default void FZ() {
		System.out.println("interface - defacult FZ method");
	}
	
	static void scooty() {
		System.out.println("interface - defacult scooty method");
	}
}
