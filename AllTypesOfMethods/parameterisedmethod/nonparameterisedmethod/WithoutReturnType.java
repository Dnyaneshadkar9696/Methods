package day3.nonparameterisedmethod;

public class WithoutReturnType {


  public void number1to10() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
		}
	}

	public void primeCheck() {
		int a = 50;
		for (int i = 2; i < a; i++) {
			// using one for loop
			// value of a should also change
			int b = 1; // every time we are thinking it is a prime number and then checking.
			for (int j = 2; j < i; j++) {
//				2 < 3 so direcly print the i
				if (i % j == 0) {
					b = b - 1;
					break;

				}

			}
			if (b == 1) {
				System.out.print(i + " ");
			}

		}

	}
	
	public void tableMul() {
		int g = 7; 
		for(int i= 1; i <= 10; i++) {
			System.out.println(g + "*" + i + "=" + (i*g));
		}
	}
	
	public void evenoddCheck() {
		int a = 78;
		if(a%2 == 0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}

  

}

}


