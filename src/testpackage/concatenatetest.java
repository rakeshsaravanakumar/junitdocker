package testpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class concatenatetest {

	@Test
	public void testConcatenate() {
		rakeshclass test = new rakeshclass();
		String result = test.concatenate("one", "two");
		assertEquals("onetwo", result);
	}

}
