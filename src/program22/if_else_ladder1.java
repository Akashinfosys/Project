package program22;

public class if_else_ladder1 {
	public static void main(String[] args) {
		
		int marks=36;
		if (marks>=75) {
			System.out.println("Passed with Distinction");
		}
		else if (marks>=60) {
			System.out.println("Passed with 1st class ");
			
		}
		else if (marks>=50) {
			System.out.println("Passed with 2nd class");
		}
		else if (marks>=40) {
			System.out.println("Passed with 3rd class");
		}
		else if (marks>=35) {
			System.out.println("Pass");
			
		}
		else {
			System.out.println("Fail");
		}
	}

}
