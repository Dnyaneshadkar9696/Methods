package day3.parameterisedmethod;

public class WithReturnType {

	public String checkVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

			return "character is a vowel";

		} else {

			return "character is not a vowel ";
		}

	}
	
	public int lenghtCheck(String r) {
		int count = 0;
		for(int i = r.length()-1; i >=0 ; i--) {
			count++;
		}
		return count;
	
	}
	
	public boolean checkEvenOdd(int f) {
		if(f%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int reverseNumber( int y) {
		int reverse = 0;
		while ( y > 0) {
			int digit = y%10;
			reverse = reverse * 10 + digit;
			y = y/10;
		}
		return reverse;
	}
	
	public int productofInteger(int c , int g) {
		return c*g;
	}

}
