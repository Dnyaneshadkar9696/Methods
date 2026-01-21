package methodpractiseDay2.methodwithoutReturnType;

public class WithoutReturnType{
	
	// to print my name 
	
	public void myName() {
		System.out.println("Name - My name is Dnyanesh");
	}
	
	// method without return type to print the numbers from 1 to 10
	
	public void numbers() {
		System.out.print("Numbers - ");
		for(int i=1; i <=10; i++) {
			System.out.print( i+ " ");
		}
	}
	
	public void checkAddition() {
		System.out.println();
		int a = 3; 
		int b = 8;
		System.out.print("Addition -"+ (a+b));
	}
	
	public void checkEvenOdd() {
		System.out.println();
		int a = 7; 
		if(a%2 == 0) {
			System.out.println("The number "+ a +" is Even");
		}
		else {
			System.out.println("The number "+ a + " is Odd");
		}
	}
	
	public void multiplicationTable() {
		System.out.println();
		System.out.println("Multiplication Table");
		int f = 4;
		for(int i=1; i <= 10 ; i++) {
			System.out.println(f + " * "+i +" = "+ (f * i));
		}
		
	}
	
	public void stringnewLine() {
		System.out.println();
		System.out.println("String print on new line");
		String dd = "Dnyanesh";
		for(int i=0; i<= dd.length()-1; i++) {
			char ds= dd.charAt(i);
			System.out.println(ds);
		}
	}

}
