package Interface;

public interface Vechicle {
    public void run();
}
class Bike implements Vechicle{
	public void run() {
		System.out.println("running imp");
	}
}
	class Car implements Vechicle{
		public void run() {
			System.out.println("car imple");

	}
	public static void main(String[] args) {
		Bike t=new Bike();
		t.run();
		Car t1=new Car();
		t1.run();
		}
}
