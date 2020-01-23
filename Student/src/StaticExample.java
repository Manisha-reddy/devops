
public class StaticExample {
public static void function2()
{
	System.out.println("inside static");
}
public static void main(String args[])
{
	System.out.println("inside main");
	StaticExample s=new StaticExample();
	s.function2();
	System.out.println("aftr static function");

}

}
