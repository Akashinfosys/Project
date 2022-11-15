package program16;

public class Example1 {//SRM call from different class
	public static void main(String[] args) {
		System.out.println("main method open");
		
		Example2.a1();//classname.methodname()
		
		Example2.a2();//classname.methodname()
		
		System.out.println("main method closed");
	}

}
