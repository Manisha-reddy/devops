class E
{
	void dispE()
	{
		System.out.println("inside class A");
	}
}
class F extends E
{
	void dispF()
	{
		System.out.println("inside class b");
	}
}
class G extends F
{
	void dispG()
	{
		System.out.println("inside class c");
	}
}
public class Mulltilevel {

	public static void main(String[] args)
	{
		
G c1=new G();
c1.dispE();
c1.dispF();
c1.dispG();
	}

}
