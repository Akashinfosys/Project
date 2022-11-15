package program16;

public class SRM_Combination {//SRM call from same class
	public static void main(String[] args) {
		System.out.println("main method opened");
		
		m1();//methodname()
		
		m2();//methodname()
		
		Example2.a1();//classname.methodname()//no need of object creation as
		                                      //it is static regular method
		Example2.a2();//classname.methodname()
		
		System.out.println("main method closed");
	}
	public static void m1() {
		
		System.out.println("Good Morning");
	}
	public static void m2() {
		
		System.out.println("Good Afternoon");
	}

}
