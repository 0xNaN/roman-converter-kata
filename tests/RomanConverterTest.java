import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanConverterTest {
	RomanConverter romanConverter;

	@Before 
	public void setUp() {
		romanConverter = new RomanConverter();		
	}
	
	@Test public void
	return_empty_string_for_zero() {
		assertEquals("", romanConverter.convert(0));
	}

}
