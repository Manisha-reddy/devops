class A
{
	static int a;
	public  void fun()
	{
		System.out.println("inside"+a);
	}
	/*
	public static void fun()
	{
		System.out.println("inside"+a);
	}*/
}
public class StaticEx {

	public static void main(String[] args) 
	{
		A a1=new A();
a1.fun();
System.out.println("aftr stat");
	}

}
