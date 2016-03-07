package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcateTest {

	@Test
	public void testConcatenate() {
		Junits test = new Junits();
		String result = test.concatenate("one","two");
		assertEquals("onetwo",result);
	}

}
