package program34_Logical_Programms;

public class Pallindrome {
	
	public static void main(String[] args) {
		
		String org="RECER";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
		
		if(org.equals(rev)) {
			System.out.println("Given string is Pallindrome");
		}
		else {
			System.out.println("Given string is not Pallindrome");
		}
	}

}
