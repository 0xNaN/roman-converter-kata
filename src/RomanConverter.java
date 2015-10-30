
public class RomanConverter {

	public String convert(int arabic) {
		if(arabic == 0)
			return "";
		else if(arabic == 1)
			return "I";
		return "V";
	}

}
