package methodpractise;

public class FactorialCheck {
	
	public void factCheck(int b) {
		
		// to calculatte the factorial of the given number
		
		int sum = 1;
		for(int i = b; i >= 1; i--) {
			sum = sum * i;
		}
		
		System.out.println("Factorial : "+ sum);
	}

}
