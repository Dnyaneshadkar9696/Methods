package methodpractise;

public class LargestOfThreeNum {
	
	public void largeNum(int a, int b , int c) {
		
		if(a>b  && a>c) {
			System.out.println(a + " is the largest number");
		}
		else if(b>a && b>c) {
			System.out.println(b + " is the largest number");
		}
		else {
			System.out.println(c + " is the largest number");
		}
		
	}

}
