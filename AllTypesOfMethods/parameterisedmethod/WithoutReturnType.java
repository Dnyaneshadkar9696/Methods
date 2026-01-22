package day3.parameterisedmethod;

public class WithoutReturnType {

	public void programName() {
		System.out.println("1) Parameterisedmethod without return type.");
	}

	public void calculator(int a, int b) {

		System.out.println("Addition is : " + (a + b));
		System.out.println("Substraction is : " + (a - b));
		System.out.println("Multiplication is : " + (a * b));
		System.out.println("Division is : " + (a / b));

	}

	public void convertToPercentage(double d) {
		double percent = (d / 100) * 100;
		System.out.println("Percentage is: " + percent);

	}

	public void printTable(int table) {
		System.out.println("Table of given number is : ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(table + " * " + i + " = " + (table * i));
		}

	}

	public void reverseName(String name) {
		// just the order of the number changes
		System.out.print("Reverse the name: ");
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));

		}
	}

	public void tillThatNumber(int h) {
		System.out.print("Print till that number: ");
		for (int i = 1; i <= h; i++) {
			System.out.print(i + " ");
		}
	}

}
