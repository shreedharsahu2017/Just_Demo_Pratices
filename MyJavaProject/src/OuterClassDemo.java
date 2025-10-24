

public class OuterClassDemo {

	    public void show() {
	    	System.out.println("shree");
	    }
	    public void display() {
	    	System.out.println("shreedhar");
	    }
	}
	class Demo extends OuterClassDemo{
		public void show() {
			System.out.println(" Extends OuterClassDemo");
		}
		class Innerdemo{
			public void run() {
				System.out.println("Inner classes");
			}
		}
		public static void main(String[] args) {
			OuterClassDemo o=new OuterClassDemo();
			o.display();
			o.show();
			Demo d=new Demo();
			d.show();
			Innerdemo a=d. new Innerdemo();
			a.run();
			
		}
	}


