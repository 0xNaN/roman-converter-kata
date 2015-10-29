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
	
	@Test public void 
	return_I_for_one() throws Exception {
		assertEquals("I", romanConverter.convert(1));
	}
	
	@Test public void
	return_V_for_five() {
		assertEquals("V", romanConverter.convert(5));
	}
	
	@Test public void
	return_II_for_two() {
		assertEquals("II", romanConverter.convert(2));
	}

}
