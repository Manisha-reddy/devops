package pack;

import java.util.List;
import java.util.*;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main2 {

	public static void main(String[] args) {
		AbstractApplicationContext ap=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		studentDao s1=(studentDao)ap.getBean("s");
		/*int count=s1.saveStudent(new student(104,"vysh"));
		System.out.println(count+"rows updated");
		int count=s1.updateStudent(new student(101,"manisha"));
		System.out.println(count+"rows updated");
		int count=s1.deleteStudent(new student(101));
		System.out.println(count+"rows updated");*/

List<student> list=s1.getAllStudents();
for(student e:list)
{
	System.out.println(e);
}
	}

}
