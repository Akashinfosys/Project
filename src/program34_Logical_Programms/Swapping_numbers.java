package program34_Logical_Programms;

public class Swapping_numbers {
	
	public static void main(String[] args) {
		//using third variable
		/*int a=10;
		int b=20;
		System.out.println("before swappiing:"+a+"and"+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("after swapping:"+a+"and"+b);*/
		
		//without using third variable
		int a=10;
		int b=20;
		System.out.println("Before swapping:"+a+"and"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping:"+a+"and"+b);
	}

}
