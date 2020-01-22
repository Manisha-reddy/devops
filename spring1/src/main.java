import org.springframework.beans.factory.*;
import org.springframework.context.*;
import org.springframework.context.support.*;
import org.springframework.core.io.*;
import org.springframework.beans.factory.xml.*;

import pack.student;
public class main {

	public static void main(String[] args) {
//ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
	
//student d=(student)a.getBean("s");
		BeanFactory b=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		student d=(student)b.getBean("s");
        d.display();


	}

}
