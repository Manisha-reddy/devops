package pack;

public class BeanClass1 {
public String message;

public void getMessage() {
System.out.println("message"+" "+message);
}

public void setMessage(String message) {
	this.message = message;
}
public void init()
{
	System.out.println("init");
}
public void destroy()
{
	System.out.println("destroy");
}
}
