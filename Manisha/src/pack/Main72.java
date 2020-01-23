package pack;
import java.util.*;

public class Main72 {

	public static void main(String[] args) {
Set s=new HashSet();
s.add(new Integer(90));
s.add(new String("hello"));
s.add(new Boolean("true"));
s.add(7.9f);
s.add(7.9f);//[7.9 90 hello true]
s.add(6);
System.out.println(s);

/*s.add(5);
s.add(7);//[5 7 9]
s.add(9);
System.out.println(s);
System.out.println(s.isEmpty());//false
System.out.println(s.contains(41));//false
System.out.println(s.remove(5));//true
System.out.println(s);//[7  9]
System.out.println(s.remove(1));//false
System.out.println(s.size());//2
s.clear();
System.out.println(s);//[]
System.out.println(s.size());//0*/





	}

}
