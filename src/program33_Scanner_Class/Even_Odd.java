package program33_Scanner_Class;

import java.util.Scanner;

public class Even_Odd {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Ley user enter number");
		int num=s.nextInt();
		
		if(num%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}

}
