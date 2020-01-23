package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import logic.*;
public class TestLogic {

	@Test
	public void test() {
		assertEquals(3,calculation.findMax(new int[] {1,3,4,2}));
	}

}
