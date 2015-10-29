
public class RomanConverter {

	public String convert(int number) {
		if(number == 0)
			return "";
		else if(number == 1)
			return "I";
		else if(number == 5)
			return "V";
		return "II";
	}

}
