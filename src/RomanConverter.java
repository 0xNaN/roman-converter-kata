import java.util.LinkedHashMap;
import java.util.Map;

public class RomanConverter {
	Map<Integer, String> arabic2romans = new LinkedHashMap<Integer, String>() {{
		put(1,	"I");
		put(5,  "V");
		put(10, "X");
	}};
	
	public String convert(int arabic) {
		if(arabic == 0)
			return "";
		
		if(arabic2romans.containsKey(arabic))
			return arabic2romans.get(arabic);
		
		int factor = biggerKnowRomansLesserThan(arabic);
		return convert(factor)+convert(arabic - factor);
	}

	private int biggerKnowRomansLesserThan(int arabic) {
		if(arabic == 2 || arabic == 3)
			return 1;
		return -1;
	}

}
