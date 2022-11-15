package program33_Scanner_Class;

import java.util.Scanner;

public class Accept_input_from_user1 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Ley user enter 1st number");
		
		int num1=s.nextInt();
		
		System.out.println("Ley user enter 2nd number");
		
		int num2=s.nextInt();
		
		System.out.println(num1+num2);
		
	
	}

}