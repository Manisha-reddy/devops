
public class General {
	public String toString()
	{
		return "hello";
	}
	public General()
	{
		System.out.println(this);
	}
	public static void main(String args[])
	{
		General g=new General();
		System.out.println(g);
	}

}
