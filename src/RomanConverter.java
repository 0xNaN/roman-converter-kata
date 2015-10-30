public class RomanConverter {
	
	public String convert(int arabic) {
		if(arabic == 0)
			return "";
		/*
		 * these lines seems a simple look up
		 * in a table
		 */
		else if(arabic == 1)
			return "I";
		else if(arabic == 5)
			return "V";
		return "X";
	}

}
