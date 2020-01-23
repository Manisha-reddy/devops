import static org.junit.Assert.*;

import org.junit.Test;



public class TestHello {
	Junit1 one=new Junit1();
	@Test
	public void test() {
		Junit1 one=new Junit1();
		assertEquals("hello world",one.say());
	}
	@Test
	public void testReverseWord() {
		System.out.println("test case reverse word");
		System.out.println(one.reverseWord("my name is khan"));
		//one.reverseWord("my name is khan");
		assertEquals("ym eman si nahk ",one.reverseWord("my name is khan"));
	}
@Test
public void test3()
{
	String s=null;
	assertNull(s);
}
@Test
public void test4()
{
	String s="hello";
	assertNotNull(s);
}
@Test
public void test5()
{
	assertTrue(7>5);
	assertFalse(1>5);
	assertNotEquals(4,6);
	assertEquals(7,7);
	
}
}
