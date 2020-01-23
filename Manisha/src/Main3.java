
public class Main3 {

	public static void main(String[] args) {
		 /* String s1=new String("manisha");
   String s2="manisha";
System.out.println(s1.equals(s2));//true
System.out.println(s1.charAt(2));//n
System.out.println(s1.endsWith(s2));//true
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));//true
System.out.println(s1.substring(2));//nisha
System.out.println(s1.substring(2,5));//nis
System.out.println(s1.toLowerCase());//manisha
System.out.println(s1.toUpperCase());//MANISHA*/
		
		String s1=new String("welcome to cts, chennai,india");
		//String s2[]=s1.split("\\s");//welcome        to          cts          chennai
		String s2[]=s1.split(",");//welcome to cts            chennai           india

		for(String s6:s2)
		{
			System.out.println(s6);
		}

	}

}
