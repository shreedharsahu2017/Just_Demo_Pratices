package AbstractMethod;

abstract class Programmer {
  abstract void developer();
}
class Html extends Programmer{

	@Override
	public void developer() {
		System.out.println("Tim Berners-Lee");
		
	}
	class Java extends Programmer {
		@Override
	public	void developer() {
			System.out.println("james gasoling");
		}
		class main{
		public static void main(String[] args) {
			Html t=new Html();
			t.developer();
			//Java j=new Java();
			//j.developer();
		}
		
	}
	
}
}
