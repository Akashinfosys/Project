package program33_Scanner_Class;

import java.util.Scanner;

public class Accept_input_from_user {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		//get 1st number from user
		System.out.println("Ley user enter 1st number");
		int num1=scan.nextInt();
		
		//get 2nd number from user
		System.out.println("Ley user enter 2nd number");
		int num2=scan.nextInt();
		
		//add two numbers
		System.out.println(num1*num2);
	}

}
