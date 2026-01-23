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

		System.out.println();
		System.out.println("3) Nonparameterised method without return type.");

		System.out.println();
		// Object
		day3.nonparameterisedmethod.WithoutReturnType np = new day3.nonparameterisedmethod.WithoutReturnType();
		np.number1to10();

		System.out.println();
		System.out.println();
		System.out.print("Prime Num : ");
		np.primeCheck();

		System.out.println();
		np.tableMul();
		System.out.println();

		np.evenoddCheck();

		System.out.println();

		// Object
		day3.nonparameterisedmethod.WithreturnType withrt = new day3.nonparameterisedmethod.WithreturnType();
		System.out.println("4) Non parameterised method with return Type");
		System.out.println();
		System.out.println(withrt.addition());
		System.out.println(withrt.giveSymbol());
		System.out.println(withrt.checkAge());
		System.out.println(withrt.Myname());
		System.out.println(withrt.NumberMob());
		System.out.println(withrt.percentageMy());
		
		
		
		
		
		
	}

}

