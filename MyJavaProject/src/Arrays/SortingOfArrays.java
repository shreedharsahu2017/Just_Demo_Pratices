package Arrays;

import java.util.Arrays;

public class SortingOfArrays {
  public static void main(String[] args) {
	System.out.println("Before sorting of Arrays: ");
	int[]a= {10,5,11,7,14};
	for(int n:a) {
		System.out.println(n);
	}
	Arrays.sort(a);

	System.out.println("After sorting of Arrays:");
	
	for(int n:a) {
		System.out.println(n);
	}
	System.out.println("Before sorting of String:");
	String str []= {"Rahul","Aphit","Shree","hit"};
	Arrays.sort(str);
    for(String strng:str) {
    	System.out.println(strng);
    }
  }
}
