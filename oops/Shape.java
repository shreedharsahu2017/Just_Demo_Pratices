class Shape 
{

	public void area(){
		System.out.println("Area of shape display");
	}
}
	class Tringle extends Shape{
		public void area(int h,int b){
			System.out.println(1/2*h*b);
		
	}
	}
	class Test
	{
	
	public static void main(String[] args) 
	{
        Shape p=new Shape();
		p.area();
		Tringle t=new Tringle();
		t.area();
	}
}
