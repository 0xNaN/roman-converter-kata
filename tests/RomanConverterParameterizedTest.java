import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RomanConverterParameterizedTest {
	private RomanConverter romanConverter;
	private int arabic;
	private String romanExpected;

	
	public RomanConverterParameterizedTest(int arabic, String roman) {
		this.arabic = arabic;
		this.romanExpected = roman;
	}
	
	@Before
	public void setUp() {
		this.romanConverter = new RomanConverter();
	}

	@Parameters
	public static Collection<Object[]> testCases () {
		return Arrays.asList(new Object[][] {
				{1,       "I"},
				{2,       "II"},
				{3,       "III"},
				{5,       "V"},
				{10,      "X"},
                {40,      "XL"},
                {50,      "L"},
                {90,      "XC"},
                {100,     "C"},
                {400,     "CD"},
                {500,     "D"},
                {900,     "CM"},
                {1000,    "M"},
                {1993,    "MCMXCIII"}
		});
	}
	
	@Test
	public void checkAll() {
		assertEquals(romanExpected, romanConverter.convert(arabic));
	}
}
