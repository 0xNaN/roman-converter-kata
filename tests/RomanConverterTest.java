import static org.junit.Assert.*;

import org.junit.Test;


public class RomanConverterTest {
	@Test public void
	return_empty_string_for_zero() {
		RomanConverter romanConverter = new RomanConverter();
		assertEquals("", romanConverter.convert(0));
	}
	
}
