package program22;

public class if_else_ladder3 {
	public static void main(String[] args) {
		double marks=34.99;
		if (marks>=75) {
			System.out.println("Passed with Distinction");
		}
		else if (marks>=60) {
			System.out.println("Passed with 1st class");
		}
		else if (marks>=50) {
			System.out.println("passed with 2nd class");
		}
		else if (marks>=40) {
			System.out.println("passed with 3rd class");
		}
		else if (marks>=35) {
			System.out.println("PASS");	
		}
		else {
			System.out.println("FAIL");
		}
	}

}
