class C
{
 void methodA()
	{
		System.out.println("a");
	}
}
class B extends C
{
 void methodB()
	{
		System.out.println("b");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		B b1=new B();
		b1.methodA();
		b1.methodB();

	}

}
