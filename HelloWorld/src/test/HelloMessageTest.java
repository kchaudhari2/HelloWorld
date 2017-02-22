package test;

import static org.junit.Assert.*;

import org.junit.*;
import main.*;

public class HelloMessageTest {

	@Test
	public void testMessageText() {
		//fail("Not yet implemented");
		HelloMessage message = new HelloMessage();
		assertEquals("Hello World", message.MessageText());
	}
}
