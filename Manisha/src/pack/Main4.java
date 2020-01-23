package pack;

public class Main4 {

	public static void main(String[] args) {
try {
/*String s=null;
System.out.println(s.length());*/
	throw new NullPointerException();
	}
/*catch(Exception e)
{
	System.out.println(e);
}
*/
finally {
	System.out.println("this is last");
}
}
}
