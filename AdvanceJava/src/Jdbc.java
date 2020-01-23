import java.sql.*;
public class Jdbc {

	public static void main(String[] args)throws ClassNotFoundException{
try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
	Statement s=c.createStatement();
	//int count=s.executeUpdate("INSERT INTO Manisha.DEPT VALUES(1,'MANI','US')");
	//int count=s.executeUpdate("UPDATE  Manisha.DEPT SET DNAME='MANISHA' WHERE DEPTNO=1 ");
	//System.out.println(count+"rows inserted");
	ResultSet rs=s.executeQuery("select *FROM Manisha.DEPT");
	while(rs.next())
	{
		System.out.println("Did"+"  "+rs.getInt(1)+" "+"name"+" "+rs.getString(2)+" "+"  val  "+" "+rs.getString(3));
	}

}
catch(SQLException e)
{
	System.out.println(e);
	
}
	}

}

