package program15;

public class Sample1 {
	public static void main(String[] args) {
		System.out.println("main method open");
		
		Sample2.m1();
		
		Sample2.m2();
		
		
		System.out.println("main method closed");
	}

}
