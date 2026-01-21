package romain;

import methodpractiseDay2.methodwithoutReturnType.WithoutReturnType;
import methodpractiseDay2.methodwithoutReturnType.WithoutReturnType;

public class MainDay2 {
	
	public static void main(String[] args) {
		
		// calling is done here for all the methods with and without return type
		
		WithoutReturnType my = new WithoutReturnType();
		my.myName();
		my.numbers();
		my.checkAddition();
		my.checkEvenOdd();
		my.multiplicationTable();
		my.stringnewLine();

		System.out.println();
		System.out.println("Starting of with return type methods");
		WithReturnType with = new WithReturnType();
		int a = with.theAddition();
		System.out.println("Addition is : "+ a);
		int w = with.theSquare();
		System.out.println("Square is : "+ w);
		boolean ds = with.checkEvenOdd();
		System.out.println("Number is Even : "+ ds);
		int u = with.greatNumber();
		System.out.println("Greatest Number is : "+ u);
		int rt = with.stringlength();
		System.out.println("Length is : "+ rt);
		String cd = with.drivingEligibility();
		System.out.println("Eligibility : " + cd);
		String der = with.checkResult();
		System.out.println("Result : "+ der);
		int xd = with.theProduct();
		System.out.println("The product of numbers is : "+ xd);
	}

}


