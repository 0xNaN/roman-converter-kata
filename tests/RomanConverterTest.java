import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RomanConverterTest {
	RomanConverter romanConverter;
	
	@Before
	public void setUp() {
		romanConverter = new RomanConverter();
	}
	
	@Test
	public void 
	should_return_empty_string_for_zero() throws Exception {
		assertEquals("", romanConverter.convert(0));
	}
	
	@Test
	public void 
	should_return_I_for_one() throws Exception {
		assertEquals("I", romanConverter.convert(1));
	}
	
	@Test
	public void
	should_return_V_for_five() throws Exception {
		assertEquals("V", romanConverter.convert(5));
	}
}
