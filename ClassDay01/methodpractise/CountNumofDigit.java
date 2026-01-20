package methodpractise;

public class CountNumofDigit {
	
	public void countNum(long a) {
		int count = 0;
		
		while(a > 0) {
			count++;
			a = a/10;
		}
		System.out.println("The count of number is : "+ count);
	}

}
