import java.sql.ResultSet;

public class Deepthi {

	
int rollno;
String name;
float marks1,marks2,marks3,avgmarks;
public void getDetails()
{
	rollno=2;
	name="deepthi";
	marks1=65f;
	marks2=60f;
	marks3=75f;
	
}
public void dispDetails()
{
	System.out.println("name:"+name);
	System.out.println("avg marks:"+avgmarks);

}
public void calculateMarks()
{
	avgmarks=(marks1+marks2+marks3)/3;
}


public static void main(String[] args) {
Deepthi d=new Deepthi();
d.getDetails();
d.calculateMarks();
d.dispDetails();
	}

}
