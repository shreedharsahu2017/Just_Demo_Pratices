package Arrays;

public class Searchingele {
  public static void main(String[] args) {
	int a[]= {10,85,96,45};
	int search_ele=45;
	boolean flag=false;
	for(int i=0;i<a.length;i++) {
		//System.out.println(a[i]);
		if(search_ele==a[i]) {
			System.out.println("ele found"+i);
			flag=true;
			break;
		}
	}
	if(flag==false) {
	System.out.println("element not found");
	}
}
}
