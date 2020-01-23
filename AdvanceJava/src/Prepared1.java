import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Prepared1 {

	public static void main(String[] args)throws ClassNotFoundException{
		try
		{
			Scanner s=new Scanner(System.in);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");
			PreparedStatement ps=c.prepareStatement("insert into Manisha.DEPT values(?,?,?)");
		/*	ps.setInt(1, 3);
			ps.setString(2, "Raj");
			ps.setString(3, "Aus");*/
			ps.setInt(1, s.nextInt());
			ps.setString(2, s.next());
			ps.setString(3, s.next());

			int count=ps.executeUpdate();
		System.out.println(count+"rows inserted");
			

		}
		catch(SQLException e)
		{
			System.out.println(e);
			
		}
			}
}
