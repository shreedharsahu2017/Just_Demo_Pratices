
public class parent {
	class Parent {
		public Object methodOne() {
	
		 return null;
		 }
	}
		 class Child extends Parent {
		 public String methodOne() {
		
		 return null;
		 }
	 }
	
}
/*C:> javac -source 1.4 Parent.java //error
It is valid in "1.5" but invalid in "1.4". */