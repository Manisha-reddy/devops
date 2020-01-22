package spring2;
import org.springframework.beans.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

public class main {

	public static void main(String[] args) {
		BeanFactory b=new XmlBeanFactory(new ClassPathResource("ApplicationContext.xml"));
	//	A a1=b.getBean("a",A.class);
		A a1=(A)b.getBean("a");

a1.setMessage("welcm to spring scope");
a1.getMessage();
A b1=(A)b.getBean("a");
b1.setMessage("wecm to spring aop");
	b1.getMessage();
	}

}
