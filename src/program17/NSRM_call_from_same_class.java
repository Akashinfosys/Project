package program17;

public class NSRM_call_from_same_class {
	public static void main(String[] args) {
		System.out.println("main method started");
		
		NSRM_call_from_same_class X=new NSRM_call_from_same_class();//object creation of same class then
		
		X.a1();//refvariable.mehod name()
		X.a2();//refvariable.methodname()
		X.a3();//refvariable.methodname()
				
		System.out.println("main method ended");
	}
public void a1() {
	System.out.println("I am a1 from same class");
}
public void a2() {
	System.out.println("I am a2 from same class");
}
public void a3() {
	System.out.println("I am a3 from same class");
}
}
