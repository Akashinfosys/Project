package program33_Scanner_Class;

import java.util.Scanner;

public class Accept_string_from_user {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Ley user enter name");
		
		String name=s.next();
		System.out.println(name);
	}

}
