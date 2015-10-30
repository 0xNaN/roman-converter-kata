import java.util.LinkedHashMap;
import java.util.Map;

public class RomanConverter {
	/*
	 * The order is important, since the keys must be looped
	 * in decreasing order
	 */
	Map<Integer, String> arabic2romans = new LinkedHashMap<Integer, String>() {{
		put(10, "X");
		put(5,  "V");
		put(1,	"I");
	}};
	
	public String convert(int arabic) {
		if(arabic == 0)
			return "";
		
		if(arabic2romans.containsKey(arabic))
			return arabic2romans.get(arabic);
		
		int factor = biggerKnowArabicLesserThan(arabic);
		return convert(factor)+convert(arabic - factor);
	}

	private int biggerKnowArabicLesserThan(int arabic) {
		for(Integer knowArabic: arabic2romans.keySet())
			if(knowArabic <= arabic)
				return knowArabic;
		return -1;
	}

}
