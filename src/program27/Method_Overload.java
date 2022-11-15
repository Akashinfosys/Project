package program27;

public class Method_Overload {//Method Overloading require or takes only one class
	
	public static void main(String[] args) {
		
		Method_Overload m=new Method_Overload();
		
		m.Addition(10, 20);
		m.Adition(10, 20, 30);
	}
	
	public void Addition(int a,int b) {
		
		System.out.println(a+b);
	}
	public void Adition(int a,int b,int c) {
		
		System.out.println(a+b+c);
	}

}
