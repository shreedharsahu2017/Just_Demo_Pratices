package Arrays;

public class MaxelementArrays {
  public static void main(String[] args) {
	int a[]= {20,85,74,69,45};
	int max=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println("maximum element of arrays"+max);
}
}
