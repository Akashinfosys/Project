package program17;

public class NSRM_call_from_different_class {
	public static void main(String[] args) {
	
		System.out.println("main method started");
		
		Different_Class S=new Different_Class();//first object creation then
		S.b1();//refvariable.methodname()
		S.b2();//refvariable.methodname()
		
		
		System.out.println("main method ended");
	}
	
}
