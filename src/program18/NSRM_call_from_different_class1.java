package program18;

public class NSRM_call_from_different_class1 {
	public static void main(String[] args) {
		System.out.println("Java is interesting");
		
		Different_class1 b=new Different_class1();
		
		b.m1();
		b.m2();
		
		
		System.out.println("Java is easy");
	}

}
