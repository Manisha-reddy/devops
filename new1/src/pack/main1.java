package pack;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.support.*;
import org.springframework.core.io.*;

public class main1 {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		BeanClass1 obj=(BeanClass1)context.getBean("b");
		obj.getMessage();
		context.registerShutdownHook();

	}

}
