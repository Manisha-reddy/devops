package pack;
import java.sql.SQLException;
import java.util.*;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.dao.DataAccessException;
public class studentDao {
private JdbcTemplate jdbcTemplate;

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public int saveStudent(student s)
{
	String query="insert into student values('"+s.getId()+"','"+s.getName()+"')";
	return jdbcTemplate.update(query);
			
}
public int updateStudent(student s)
{
	String query="update student set name='"+s.getName()+"'where id='"+s.getId()+"'";
return jdbcTemplate.update(query);
}
public int deleteStudent(student s)
{
	String query="delete from student where id='"+s.getId()+"' ";
return jdbcTemplate.update(query);
}
public List<student> getAllStudents() {
	return jdbcTemplate.query("select * from student",new ResultSetExtractor<List<student>>() {
		
		@Override
		public List<student> extractData(java.sql.ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			List <student>list=new ArrayList<student>();
			while(rs.next()) {
				student e=new student();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				list.add(e);
			}
			return list;
			}
			});
		}
	}
		
		
	

