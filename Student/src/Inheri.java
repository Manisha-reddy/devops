/*class H
{
	H()
	{
	System.out.println("h ");
}
}
class I extends H
{
	I()
	{
	System.out.println("i  ");
}
}
public class Inheri {

	public static void main(String[] args) {
H h=new H();
I i=new I();
	}

}*/
class H
{
	void disp()
	{
	System.out.println("h ");
}
	void disp1()
	{
		System.out.println("inside disp in parent");
	}
}
class I extends H
{
	void disp()
	{
		super.disp();
	System.out.println("i  ");
	//super.disp();

}
	void disp2()
	{
		System.out.println("inside disp in child");
	}
}
public class Inheri {

	public static void main(String[] args) {
		H i=new I();
//I i=new I();
i.disp();
i.disp1();
//i.disp2();
//i.disp();
	}

}
