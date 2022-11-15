package program18;

public class NSRM_call_from_same_class1 {
	public static void main(String[] args) {
		System.out.println("Main method started");
		
		NSRM_call_from_same_class1 d=new NSRM_call_from_same_class1();
		
		d.j1();
		d.j2();
		
		
		
		System.out.println("Main method ended");
	}
	public void j1() {
		System.out.println("Good morning");
	}
	public void j2() {
		System.out.println("Good evening");
	}

}
