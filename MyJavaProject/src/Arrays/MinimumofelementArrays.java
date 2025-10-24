package Arrays;

public class MinimumofelementArrays {
  public static void main(String[] args) {
	int a []= {10,25,78,45};
	int min=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
	System.out.println("minimum ele in arrays:"+min);
}
}
