package program35_Exception_Handaling;

public class B {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		try {
			int c=a/b;
			
		}
		catch(ArithmeticException e) {
			System.out.println("Enter valid denominator");
		}
		
		
	}
	
	}


