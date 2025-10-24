class FisDemo 
{
	public static void main(String[] args) throws FileNotFoundException,IoException{
	
		FileInputStream fis=new FileInputStream("abc.txt");
		int data=fis.read();
		System.out.println("Hello World!");
		System.out.println("data"+data);
		fis.close();

	}
}
