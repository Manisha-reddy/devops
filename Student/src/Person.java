import java.util.Scanner;

public class Person {
	
	/*String s;
	int c;
	byte b;
	long l;
	short sh;
	float f;
	char a;
	boolean bo;*/
	
	Person()//no arg constructor
	{
		System.out.println("inside cons");
	}
	Person(int a)//no arg constructor
	{
		System.out.println("inside a"+a);
	}
public static void main(String arg[])
	{
	System.out.println("befor pf");

		Person p=new Person();
		Person p1=new Person(9);

		/*System.out.println(p.c);
		System.out.println(p.s);
		System.out.println(p.a);
		System.out.println(p.b);
		System.out.println(p.sh);
		System.out.println(p.f);
		System.out.println(p.l);
		System.out.println(p.bo);*/
		System.out.println("inside main");
		
		


	}

}
