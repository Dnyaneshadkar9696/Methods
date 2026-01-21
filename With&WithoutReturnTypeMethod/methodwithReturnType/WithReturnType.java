package methodpractiseDay2.methodwithReturnType;

public class WithReturnType {
	
	// to return sum of the two numbers
	
	public int theAddition() {
		int a = 5;
		int b = 4;
		int c = a+ b; 
		return c;
	}
	
	public int theSquare() {
		int d = 5;
		int e = d * d;
		return e;
	}
	
	public boolean checkEvenOdd() {
		int r = 45;
		if(r%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int greatNumber() {
		
		int a = 32; 
		int b = 343;
		if(a > b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public int stringlength() {
		int count = 0;
		String de = "Dnyanesh";
		return de.length();
		
	}
	
	public String drivingEligibility() {
		int age = 34;
		String dc = "You are not eligible for driving";
		String dx = "You are eligible for driving ";
		if(age > 18) {
			return dx;
		}
		else {
			return dc;
		}
	}
	
	public String checkResult() {
		int marks = 45;
		String st = "Pass";
		String dt = "Fail";
		if(marks > 35) {
			return st;
		}
		else {
			return dt;
		}
	}
	
	public int theProduct() {
		int i = 45;
		int s = 43;
		return i*s;
	}


}
