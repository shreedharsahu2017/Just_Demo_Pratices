package Arrays;

public class MissingeleArrays {
   public static void main(String[] args) {
	int a[]= {1,2,3,4};
	int sum1=0;
	int sum2 = 0;
	for(int i=0;i<a.length;i++) {
		sum1 = sum1+a[i];
	}
	System.out.println("sum of arrays"+sum1);
	
	
	for(int i=1;i<=5;i++) {
		sum2=sum2+i;
	}
	System.out.println("range of sum of arrays"+sum2);
	System.out.println("mising of arrays of ele"+(sum2-sum1));
}
}
