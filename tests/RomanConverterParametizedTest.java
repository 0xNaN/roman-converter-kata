import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RomanConverterParametizedTest {
	RomanConverter romanConverter;
	private int arabic;
	private String roman;
	
	@Parameters
    public static Collection<Object[]> getAllConversion() {
        return Arrays.asList(new Object[][] {
                {1, "I"},
                {2, "II"},
                {4, "IV"},
                {5, "V"},
                {9, "IX"},
                {10, "X"},
                {40,    "XL"},
                {50,    "L"},
                {90,    "XC"},
                {100,   "C"},
                {400,   "CD"},
                {500,   "D"},
                {900,   "CM"},
                {1000,  "M"}                                                                                        
        });
    }
	
    public RomanConverterParametizedTest(int arabic, String roman) {
    	this.arabic = arabic;
    	this.roman  = roman;
    }
    
	@Before 
	public void setUp() {
		romanConverter = new RomanConverter();		
	}
	
	@Test public void
	checks_conversions() {
		assertEquals(this.roman, romanConverter.convert(this.arabic));
	}
}
