
package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void testMultiply() {
		Junits test = new Junits();
		int result = test.multiply(3,5);
		assertEquals(16,result);
	}

}
