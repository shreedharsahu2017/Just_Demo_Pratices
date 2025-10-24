

import java.util.Arrays;

public class Secondelement {

	public static void main(String[] args) {
		int [] a= {17,96,4,20,36};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("secondelement present in arrays"+a[0]);
		Arrays.sort(a);
		System.out.println("sorted arrays:"+Arrays.toString(a));

	}

}
