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
		else if(arabic == 10)
			return "X";
		int factor = biggerKnowRomansLesserThan(arabic);
		return convert(factor)+convert(arabic - factor);
	}

	private int biggerKnowRomansLesserThan(int arabic) {
		if(arabic == 2)
			return 1;
		return -1;
	}

}
