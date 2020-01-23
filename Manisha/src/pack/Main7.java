package pack;

public class Main7 {

	public static void main(String[] args) {
try {
	function1();
	System.out.println("a");
}
catch(RuntimeException re)
{
	System.out.println("b");
}
catch(Exception e)
{
	System.out.println("c");
}
finally {
	System.out.println("d");
}
System.out.println("e");
	}
	public static void function1()
	{
throw new RuntimeException();
}

}
