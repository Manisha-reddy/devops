package pack;

class MyException extends Exception {
	int a,b;

MyException(int a,int b)
{
	this.a=a;
	this.b=b;
}
	public String toString()
	{
		return "erre the val shd nt be grater than 20";
	}

}

public class Main5 {
	public static void calculate(int a,int b) throws Exception
	{
		int sum=a+b;
		if(sum>20)
		throw new MyException(a,b);
	    System.out.println("res is"+sum);
	}


	public static void main(String[] args)throws Exception {
		try
		{
			calculate(3,4);
			calculate(31,4);
		}
		catch(MyException e)
		{
			System.out.println(e);
		}

	}

}
