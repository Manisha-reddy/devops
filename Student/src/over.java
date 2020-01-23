class J
{
	private void disp()
	{
		System.out.println("in j");
	}
	
	/*J()
	{
		System.out.println("j");

	}
	J(int i)
	{
		System.out.println("jp");

	}*/
}
class K extends J
{
	 void disp()
	{
		System.out.println("in k");
	}
	/*K()
	{
		super();
		System.out.println("k-");
	}
	K(int p)
	{
		super(p);
		
		System.out.println("k");
	}*/
	
}
public class over {

	public static void main(String[] args) {
		K k=new K();
		k.disp();
//K k1=new K();
	}

}
