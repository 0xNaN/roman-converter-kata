import java.util.LinkedHashMap;
import java.util.Map;

public class RomanConverter {
	/*
	 * The order is important, since the keys must be looped
	 * in decreasing order
	 */
	Map<Integer, String> arabic2romans = new LinkedHashMap<Integer, String>() {{
		put(1000,    "M");
		put(900,     "CM");
		put(500,     "D");
		put(400,     "CD");
		put(100,     "C");
		put(90,      "XC");
		put(50,      "L");
		put(40,      "XL");
		put(10,      "X");
		put(5,       "V");
		put(1,       "I");
	}};
	
	public String convert(int arabic) {
		if(arabic == 0)
			return "";
		
		int factor = biggerKnowArabicLesserThan(arabic);
		return arabic2romans.get(factor)+convert(arabic - factor);
	}

	private int biggerKnowArabicLesserThan(int arabic) {
		for(Integer knowArabic: arabic2romans.keySet())
			if(knowArabic <= arabic)
				return knowArabic;
		return -1;
	}

}
