package pack;
import java.util.*;
public class LinkedList1 {

	public static void main(String[] args) {
LinkedList l=new LinkedList();
l.add(5);
l.add(new String("h"));
l.add(true);
l.add(9.8f);
System.out.println(l);
Iterator i=l.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}

}
}