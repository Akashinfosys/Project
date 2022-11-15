package program35_Exception_Handaling;

public class A {
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		try {
			int c=a/b;
		}
		catch(RuntimeException e) {
			
			System.out.println("Ente rvalid denominator");
			
		}
	}

}
