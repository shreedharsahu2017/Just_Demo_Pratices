
public class SelectionSort {
   public static void printArray(int a[]) {
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
}
   public static void main(String[] args) {
	int [] a= {20,78,63,13,6,7};
	 
	for(int i=0;i<a.length-1;i++) {
		int smallest=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[smallest]>a[j]) {
				smallest=j;
			}
		}
		//swap
		int temp=a[smallest];
		a[smallest]=a[i];
		a[i]=temp;
	}
	printArray(a);
}
}
