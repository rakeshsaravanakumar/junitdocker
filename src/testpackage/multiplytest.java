package testpackage;

import static org.junit.Assert.*;

import org.junit.Test;


public class multiplytest {

	@Test
	public void testMultiply() {
		rakeshclass test = new rakeshclass();
		int result = test.multiply(3, 5);
		assertEquals(14, result);
	}

}
