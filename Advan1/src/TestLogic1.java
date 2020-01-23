import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestLogic1 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("before testing any method");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("aftr all test");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before each test");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("aftr each test");
	}

	@Test
	public void test() {
		int a[]= {1,3,4};
		int b[]= {1,3,4};
		assertArrayEquals(a,b);
		
	}

}
