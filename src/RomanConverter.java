import java.util.HashMap;
import java.util.LinkedHashMap;


public class RomanConverter {
	HashMap<Integer, String> arabic2roman = new LinkedHashMap<Integer, String>();
	
	public RomanConverter() {
		/*
		 * The order is important since it defines how the keys are searched
		 */
		arabic2roman.put(5, "V");
		arabic2roman.put(1, "I");
	}
	
	public String convert(int number) {
		if(number == 0)
			return "";

		int arabic = conversionFactorsFor(number);
		String roman = arabic2roman.get(arabic);

		return roman + convert(number - arabic);
	}

	public int conversionFactorsFor(int number) {
		for(int arabic: arabic2roman.keySet()) {
			if(arabic <= number)
				return arabic;
		}
		return -1;
	}
}
