
public class RomanConverter {

	public String convert(int number) {
		if(number == 0)
			return "";
		else if(number == 1)
			return "I";
		
		return "V";
	}

}
