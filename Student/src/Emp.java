import java.util.Scanner;

public class Emp {
	int eid,sal;
	String name;
	Emp()
	{
		System.out.println("default cons");
	}
	
	Emp(int e,String n,int s)
	{
		eid=e;
		name=n;
		sal=s;
		System.out.println("id,name and sal is :"+e+ n+ s);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Emp e1=new Emp();
		Emp e=new Emp(s.nextInt(),s.next(),s.nextInt());
		
		
	}

}
