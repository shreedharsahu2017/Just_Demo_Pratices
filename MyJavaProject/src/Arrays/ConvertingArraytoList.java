package Arrays;

import java.util.Arrays;
import java.util.List;

public class ConvertingArraytoList {
 public static void main(String[] args) {
	String a[]= {"Rakesh","rohit","rahul"};
	List l=Arrays.asList(a);
	System.out.println(l);
	a[1]="Shree";
	System.out.println(l);
	l.set(2, "lucky");
	System.out.println(l);
	l.remove(2);   //unsupportedException
	System.out.println(l);
}
}
