package pack;
import java.util.*;

public class student {
	private String name;
	private int id;
	//private Address a;
	private List<String> Mobile;
	


	public student(String name, int id, List mobile) {
		this.name = name;
		this.id = id;
		Mobile = mobile;
	}



	/*public student(String name, int id, Address a) {
		super();
		this.name = name;
		this.id = id;
		this.a = a;
	}
*/


	public void display()
	{
		//System.out.println("id:"+this.id+"\n"+"name:"+this.name);
//		System.out.println("id:"+this.id+"\n"+"name:"+this.name+" "+this.a);
		System.out.println("id:"+this.id+"\n"+"name:"+this.name+" "+this.Mobile);
		Iterator i=Mobile.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	
	}

}
