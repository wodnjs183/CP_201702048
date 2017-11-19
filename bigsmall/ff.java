package bigsmall;

public class ff {
	private static final int lowerStart = 97;
	private static final int lowerEnd = 122;
	private static final int upperStart = 65;
	private static final int upperEnd = 90;
	
	public static char convertUpperToLower(char s) {
		int i=s;
		if(i>=upperStart&&i<=upperEnd)i=i+32;
		return(char)i;
	}
	
	public static char convertLowerToUpper(char s) {
		int i=s;
		if(i>=lowerStart && i <=lowerEnd) i = i-32;
		return (char)i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertUpperToLower('A'));
		System.out.println(convertUpperToLower('X'));
		System.out.println(convertLowerToUpper('a'));
		System.out.println(convertLowerToUpper('x'));

	}

}


