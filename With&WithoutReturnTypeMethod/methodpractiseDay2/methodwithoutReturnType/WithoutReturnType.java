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

}
