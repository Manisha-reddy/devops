package pack;

public class Main6 {

	public static void main(String[] args) {
int a=20;
System.out.println(a);
Integer b=70;
System.out.println(b);//auto boxing
Integer i=Integer.valueOf(a);
System.out.println(i);//boxing
Integer a1=new Integer(3);
int j=a1.intValue();//unboxing
System.out.println(j);
int j1=a1;
System.out.println(j1);//auto unboxing
	}

}
