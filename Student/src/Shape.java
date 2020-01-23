
public class Shape {
	int a;
	final float PI=3.14f;
	public void area(int a)
	{
		this.a=a;
		System.out.println("sq"+(a*a));
	}
	public void area(int l,int b)
	{
		//this.a=a;
		System.out.println("rect"+(l*b));
	}
	public void area(int a)
	{
		this.a=a;
		System.out.println("cir"+(PI*a*a));
	}
	public static void main(String[] args) 
	{
Shape s=new Shape();
s.area(5);
s.area(2,7);
s.area(6);
	}

}
