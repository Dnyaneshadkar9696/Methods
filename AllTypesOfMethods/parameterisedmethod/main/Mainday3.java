package day3.main;

import day3.parameterisedmethod.WithReturnType;
import day3.parameterisedmethod.WithoutReturnType;

public class Mainday3 {

	public static void main(String[] args) {

		WithoutReturnType pro = new WithoutReturnType();
		pro.programName();
		System.out.println();
		System.out.println("Calculator");
		pro.calculator(4, 2);
		System.out.println();

		pro.convertToPercentage(45.4);
		System.out.println();

		pro.printTable(5);
		System.out.println();

		pro.reverseName("Dnyanesh");

		System.out.println();
		pro.tillThatNumber(7);

		System.out.println();// next line
		System.out.println();// // next line so it will give one space
		System.out.println("2) Parameterised method with return type.");

		WithReturnType par = new WithReturnType();
		System.out.println();
		String a = par.checkVowel('w'); // the returned value is stored String a and then we print it
		System.out.println(a);

		System.out.println();
		int b = par.lenghtCheck("Dnyanesh");
		System.out.println("Count is: " + b); // returned value is stroed or we can directly syso
        
		
		System.out.println();
		System.out.println("The number is Even : " + par.checkEvenOdd(45));
		
		System.out.println();
        System.out.println("Reverse the number: " + par.reverseNumber(12345));
		
		
		System.out.println();
		System.out.println("Product of integer is : "+ par.productofInteger(4, 2));
		
		
		
		
		
		
	}

}
