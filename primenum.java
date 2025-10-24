import java.util.Scanner;
class primenum
{
	public static void main(String[] args) 
	{
		System.out println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int count=0;
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0){
				count++;
			}
			if(count==2){
			System.out.println("prime number");
			}
			else{
			System.out.println("not prime number:");
			}
	}
}
