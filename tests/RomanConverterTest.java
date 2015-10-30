import static org.junit.Assert.*;

import org.junit.Test;


public class RomanConverterTest {
	
	@Test
	public void 
	should_return_empty_string_for_zero() throws Exception {
		RomanConverter romanConverter = new RomanConverter();
		assertEquals("", romanConverter.convert(0));
	}
}
