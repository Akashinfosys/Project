package program34_Logical_Programms;

public class Reverse_String2 {
	
	public static void main(String[] args) {
		
		String org="KALYANI";
		String rev=" ";
		
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
	}

}
