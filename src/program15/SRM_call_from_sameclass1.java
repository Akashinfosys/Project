package program15;

public class SRM_call_from_sameclass1 {
	public static void main(String[] args) {
		System.out.println("main method is started");
		
		m1();//methodname()
		m2();//methodname()
		m3();//methodname()
		
		
		System.out.println("main method is closed");	
		
	}
	public static void m1() {
		System.out.println("I am running from regular method m1");
		
	}
	public static void m2() {
		System.out.println("I am running from regular method m2");
	}
	public static void m3() {
		System.out.println("I am running from regular method m3");
	}

}
