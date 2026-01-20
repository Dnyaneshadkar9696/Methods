package methodpractise;

public class PrimeCheck {
	
	public void primeCheck(int c) {
		int bul = 1;
		for(int i = 2; i < c; i++) {
			if(c%i == 0) {
				bul = bul -1;
				break;
			}
		}
		if(bul == 1) {
			System.out.println("The number is a prime number");
		}
		else {
			System.out.println("The numeber is not  a prime number");
		}
	}

}
